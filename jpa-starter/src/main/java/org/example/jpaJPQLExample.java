package org.example;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public class jpaJPQLExample {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myApp");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        TypedQuery<String> query = entityManager.createQuery(
                "select e.name from Employee e",
                String.class
        );
        List<String> resultList = query.getResultList();
        resultList.forEach(System.out::println);

        entityManager.close();
        entityManagerFactory.close();
//        For avoiding sql injection what we can do
        /*int minAge = "25"  here age is coming from another source
        TypedQuery<Employee> query = entityManager.createQuery(
            "select e from Employee e where e.age >" + minAge,
            Employee.class
        )
        $$The above line of code refer to as bad practice because anyone can send a valid query
        and then able to run any valid query to avoid this....
        ***************The best practice to avoid sql injection
        int minAge = "24"
        TypedQuery<Employee> query = entityManager.createQuery(
            "select e from Employee e where e.age > :minAge,
            Employee.class
        )
        query.setParameter("minAge", minAge)
        * */
    }

}
