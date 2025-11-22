package com.javaInterview.question.hibernate;

public class Hibernate {

}
/*

	Hibernate - Hibernate is an ORM (Object Relational Mapping) framework in Java that maps Java classes to database tables 
	and automatically handles SQL operations. It allows developers to work with Java objects instead of writing SQL manually.
	
	ORM means:( Object → Table, Field → Column, Object Instance → Row )
	
	Advantages - 
	1. Eliminates boilerplate JDBC code
	2. Database independent
	3. HQL ( Hibernate Query Language)
	4. Auto DDL ( Hibernate can auto-create/update DB schema)

	------- Hibernate Architecture
	Application → SessionFactory → Session → Transaction → Query/Criteria → DB

	
	----Configuration file ( hibernate.cfg.xml)
	<?xml version="1.0" encoding="UTF-8"?>
	<!DOCTYPE hibernate-configuration PUBLIC
	        "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
	        "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">        
	<hibernate-configuration>
	    <session-factory>
	        <property name="hibernate.dialect">org.hibernate.dialect.MySQL5Dialect</property>
	        <property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
	        <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/testdb</property>
	        <property name="hibernate.connection.username">root</property>
	        <property name="hibernate.connection.password">root</property>
	
	        <property name="hibernate.hbm2ddl.auto">update</property>
	        <property name="show_sql">true</property>
	
	        <mapping class="com.example.Employee"/>
	
	    </session-factory>
	</hibernate-configuration>
	
	hibernate.hbm2ddl.auto = update ( Updates schema) | create (Drops and creates schema ) | validate (Checks schema ) | none ( Nothing)


	-----main method 
	public class HibernateDemo {
	    public static void main(String[] args) {	
	        SessionFactory factory = new Configuration()
						                .configure("hibernate.cfg.xml")
						                .buildSessionFactory();
	        Session session = factory.openSession();
	        Transaction tx = session.beginTransaction();
	        Employee emp = new Employee("Kishan", 50000);
	        session.save(emp); -- saving employee using Hibernate
	        tx.commit();
	        session.close();
	        factory.close();
	        System.out.println("Employee Saved Successfully!");
	    }
	}
	
	--- SessionFactory → Heavyweight object, created once, thread-safe
	--- Session → Lightweight object, used for CRUD operations
	
	-- HQL - Hibernate Query Language – database-independent, object-oriented.

	-- update in hibernate
	Employee e = session.get(Employee.class, 1);
	e.setSalary(90000);
	session.update(e);
	
	-- delete in Hibernate 
	Employee e = session.load(Employee.class, 1);
    session.delete(e);

	-- different types uses of where clause in java Hibernate
	
	1. select using where clause HQL === Hibernate Query Language
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		String hql = "FROM Employee e WHERE e.department = :dept";
		Query<Employee> query = session.createQuery(hql, Employee.class);
		query.setParameter("dept", "IT");
		
		List<Employee> employees = query.list();
		
		session.getTransaction().commit();
		session.close();
		
	2. USING CriteriaBuilder (modern JPA way)
		
		Session session = sessionFactory.openSession();
		
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
		Root<Employee> root = cq.from(Employee.class);
		
		cq.select(root).where(cb.lt(root.get("salary"), 60000));
		
		Query<Employee> query = session.createQuery(cq);
		List<Employee> employees = query.getResultList();
	
	3. Native SQL (raw SQL)
		String sql = "SELECT * FROM employee WHERE department = :dept";

		Query<Employee> query = session.createNativeQuery(sql, Employee.class);
		query.setParameter("dept", "IT");
		
		List<Employee> list = query.getResultList();
		
	Question :- Which is faster: HQL, Criteria, or Native SQL?
	Answer -
			✔ Native SQL is fastest
			✔ HQL is second
			✔ Criteria is equal to HQL but used for dynamic queries


















*/