package com.topyfi.runner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.topyfi.model.Address;
import com.topyfi.model.NormalUser;
import com.topyfi.model.Resolution;

public class Test {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		/*
		NormalUser user = new NormalUser();
		Address address = new Address();
		address.setCity("Wrocław");
		address.setCountry("Poland");
		address.setStreetName("Żytnia");
		address.setBuildingNumb(11);
		address.setApartmentNumb(5);
		address.setPostalCode(33444);
		
		
		user.setName("Tomasz");
		user.setLastName("Bartnik");
		user.setPhoneNumber(111111111);
		user.setUserLogin("tomasz");
		user.setUserPassword("tomasz");
		user.setAddress(address);
		
		session.save(user);
*/
		Resolution resolution = new Resolution();
		resolution.setContent("Remont klatki schodowej");
		session.save(resolution);
		
		session.getTransaction().commit();
		
		session.close();
		sessionFactory.close();
	}

}
