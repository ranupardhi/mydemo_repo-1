package com.tcs.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tcs.jpa.entity.Employee;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("EclipseLinkdemo");
		EntityManager em = emf.createEntityManager();

		// Insert Operations
		Employee emp = new Employee();
		emp.setId(4);
		emp.setName("sample3");
		emp.setEmail("sample3@gmail.com");

		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();

		System.out.println("One Record Inserted!!!");

	}

}
