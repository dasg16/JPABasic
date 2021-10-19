package com.das.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String args[]) {
		Alien a = new Alien();
		a.aID = 107;
		a.aName = "Monsoor";
		a.sColor = "Brown";

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		// To add the object in the DB
		// em.persist(a);

		// To find/get the object from the DB
		Alien al = em.find(Alien.class, 101);

		em.getTransaction().commit();

		System.out.println(a.sColor);
		System.out.println(al.aName);
	}

}
