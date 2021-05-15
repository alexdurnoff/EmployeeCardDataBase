package ru.durnov.dao;

import ru.durnov.model.Employee;

import javax.persistence.*;
import java.util.List;

public class EmployeeDaoService implements EmployeeService {
    private final EntityManagerFactory entityManagerFactory;


    public EmployeeDaoService(){
        this.entityManagerFactory = Persistence.createEntityManagerFactory("Employee");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
    }


    @Override
    public Employee employeeById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        return entityManager.find(Employee.class, id);
    }

    @Override
    public List<Employee> findAll() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        List<Employee> employeeList = entityManager.createQuery("select e from Employee e").getResultList();
        return employeeList;
    }

    @Override
    public void saveEmployee(Employee employee) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        entityManager.persist(employee);
        transaction.commit();
        entityManager.close();
    }
}
