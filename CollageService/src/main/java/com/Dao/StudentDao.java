package com.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.Model.Student;
import com.Model.User;


@Repository
@Transactional
public class StudentDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Autowired
	SessionFactory sessionFactory ;
	
	int id;
	

	public void addStudent(Student student) {
		this.hibernateTemplate.saveOrUpdate(student);
	}
	
	
	public int getUserInfo(String para1,String para2) {
		
		Session session =  sessionFactory.getCurrentSession();

		@SuppressWarnings("deprecation")
		Criteria crit = session.createCriteria(Student.class);
		
		crit.add(Restrictions.eq("emailString",para1));
		crit.add(Restrictions.eq("passString",para2));
		@SuppressWarnings("unchecked")
		List<Student> results = crit.list();
		try {
			id = results.get(0).getId();					
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (results.isEmpty()) {
			return 0;
		}else {
			return id;
		}
		
		
	
	}
	
	public Student getStudent() {
		Student student = hibernateTemplate.get(Student.class,id);
		return student;
	}
	
	public void removeStudent() {
		Student student = getStudent();
		this.hibernateTemplate.delete(student);
	}
	

}
