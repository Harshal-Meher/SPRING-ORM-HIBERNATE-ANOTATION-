package com.example.demo.modal;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class StudentDao {

	HibernateTemplate template;

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	public boolean saveStu(Student s)
	{
		template.save(s);
		
		return true;
	}

	
	
}
