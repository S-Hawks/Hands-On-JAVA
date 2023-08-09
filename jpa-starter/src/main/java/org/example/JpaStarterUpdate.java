package org.example;

import jakarta.persistence.*;

public class JpaStarterUpdate {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myApp");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Employee employee = entityManager.find(Employee.class, 1);
        EmailGroup emailGroup = entityManager.find(EmailGroup.class,2);

        employee.addEmailGroup(emailGroup);
        emailGroup.addEmployee(employee);

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        entityManager.persist(employee);
        entityManager.persist(emailGroup);

        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }
}
