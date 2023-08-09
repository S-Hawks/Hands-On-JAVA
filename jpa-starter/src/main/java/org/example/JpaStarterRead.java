package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaStarterRead {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myApp");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

//        PayStub payStub = entityManager.find(PayStub.class, 2);
//        System.out.println(payStub.getEmployee());
        Employee employee = entityManager.find(Employee.class, 1);
        System.out.println(employee.getPayStubs());

    }
}
