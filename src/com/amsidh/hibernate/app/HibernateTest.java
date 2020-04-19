package com.amsidh.hibernate.app;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.amsidh.hibernate.domains.UserDetails;
import com.amsidh.hibernate.domains.Vehicle;

public class HibernateTest {

	public static void main(String[] args) {

		UserDetails user = new UserDetails();
		user.setUserName("First User");

		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("CAR");

		Vehicle vehicle2 = new Vehicle();
		vehicle2.setVehicleName("BIKE");
        
		Vehicle vehicle3 = new Vehicle();
		vehicle3.setVehicleName("MOTOR");

		Vehicle vehicle4 = new Vehicle();
		vehicle4.setVehicleName("TRUCK");

		Vehicle vehicle5 = new Vehicle();
		vehicle5.setVehicleName("ZEEP");

		Vehicle vehicle6 = new Vehicle();
		vehicle6.setVehicleName("CYCLE");

		Vehicle vehicle7 = new Vehicle();
		vehicle7.setVehicleName("BYCYCLE");


		
		user.getVehicleList().add(vehicle);
		user.getVehicleList().add(vehicle2);
		user.getVehicleList().add(vehicle3);
		user.getVehicleList().add(vehicle4);
		user.getVehicleList().add(vehicle5);
		user.getVehicleList().add(vehicle6);
		user.getVehicleList().add(vehicle7);
		
		
		
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		
		session.getTransaction().commit();
		session.close();

	}

}
