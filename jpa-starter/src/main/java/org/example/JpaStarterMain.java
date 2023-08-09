package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.Date;
import java.util.List;

public class JpaStarterMain {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Foo Bar");
        employee.setDob(new Date());
        employee.setAge(20);
        employee.setType(EmployeeType.FULL_TIME);

        Employee employee1 = new Employee();
        employee1.setName("Bar Baz");
        employee1.setSsn(1234);
        employee1.setDob(new Date());
        employee1.setAge(30);
        employee1.setType(EmployeeType.FULL_TIME);

        Employee employee2 = new Employee();
        employee2.setName("Baz Foo");
        employee2.setSsn(12345);    //nullable is not working -> need to find the reason.
        employee2.setDob(new Date());
        employee2.setAge(26);
        employee2.setType(EmployeeType.FULL_TIME);

        //payStub for oneToMany and manyToOne Relationship
        PayStub payStub1 = new PayStub();
        payStub1.setPayPeriodStart(new Date());
        payStub1.setPayPeriodEnd(new Date());
        payStub1.setSalary(1000);
        payStub1.setEmployee(employee1);
        employee1.addPayStub(payStub1);    //Doing this for reverse cyclical relationship

        PayStub payStub2 = new PayStub();
        payStub2.setPayPeriodStart(new Date());
        payStub2.setPayPeriodEnd(new Date());
        payStub2.setSalary(2000);
        payStub2.setEmployee(employee1);
        employee1.addPayStub(payStub2);      //Doing this for reverse cyclical relationship

        EmailGroup group1 =  new EmailGroup();
        group1.setName("Company Watercooler discussions");

        EmailGroup group2 = new EmailGroup();
        group2.setName("Engineers");





        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myApp");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(employee);
        entityManager.persist(employee1);
        entityManager.persist(employee2);

        entityManager.persist(payStub1);
        entityManager.persist(payStub2);

        entityManager.persist(group1);
        entityManager.persist(group2);

        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();

        //there is some additional process to update delete and find data using
        //entity manager factory. need some specific changes to persistence.xml file in <properties hbm2ddl> section

    }

}
