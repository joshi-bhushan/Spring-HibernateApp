package com.ydel.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.ydel.entity.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	// create student
	
	@Transactional
	public int insert(Student student)
	{
		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}
	
	
	// get student by id
	
	public Student getStudent(int studentId)
	{
		 Student student=this.hibernateTemplate.get(Student.class, studentId);
		 
		 return student;
		 
	}
	
	// get all student
	
	public List<Student> getAll()
	{
	
		List<Student> studentList= this.hibernateTemplate.loadAll(Student.class);
			return studentList ;
	}
	
	
	//delete student by id
	
	public void deleteStudentByid(int studentId)
	{
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}
	
	
	//update student by Id
	public void updateStudent(Student student)
	{
		this.hibernateTemplate.update(student);
	}
	
	
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
}
