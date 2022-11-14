package com.tcs.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.tcs.jpa.entity.Customer;


public class Tester {


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("myjpaproject");
			EntityManager cu = emf.createEntityManager();

			//java.util.Date jdate = new java.util.Date();
			//java.sql.Date myDate = new java.sql.Date("2001-01-31");
			// Insert Operations
			Customer cus = new Customer();
			cus.setId(3);
			cus.setUsername("ram");
			cus.setPassword("12345");
			cus.setName("sample3");
			cus.setEmail("ram@gmail.com");
			//String date = "2001-02-12";
			//cus.setDateofbirth(java.util.Date);

			cu.getTransaction().begin();
			cu.persist(cus);
			cu.getTransaction().commit();

			System.out.println("One Record Inserted!!!");

		}

	}


