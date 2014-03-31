package com.xyz.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

import com.xyz.model.UserModel;
import com.xyz.service.*;
import com.xyz.resorces.*;

public class UserDao {

 
	public UserDao() {
		// TODO Auto-generated constructor stub
	}
	
	public void createUser(String firstName, String lastName) {

		UserModel usr = new UserModel();

		usr.setFirstName(firstName);
		usr.setLastName(lastName);

		Configuration configuration = new Configuration();
		configuration.configure();
		org.hibernate.service.ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
				.applySettings(configuration.getProperties())
				.buildServiceRegistry();
		SessionFactory sessionFactory = configuration
				.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(usr);
		session.getTransaction().commit();
		session.close();

	}

}
