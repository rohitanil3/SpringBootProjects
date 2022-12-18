package com.onesolvent.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesolvent.entity.Employee;


@Repository
@Transactional
public class EmployeeHibernateDAOImpl implements EmployeeDAO {
	
	EntityManager entityManager;
	
	
    @Autowired
	public EmployeeHibernateDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}



	@Override
	public List<Employee> findAll() {
		Session session = entityManager.unwrap(Session.class);
		
		Query<Employee> query = session.createQuery("from Employee",Employee.class);
		
		return query.getResultList();
	}



	@Override
	public Employee findById(int theid) {
		Session session = entityManager.unwrap(Session.class);
		Employee e=session.get(Employee.class, theid);
		return e;
	}



	@Override
	public void deleteById(int theid) {
		Session session = entityManager.unwrap(Session.class);
		Query query = session.createQuery("delete from Employee where id=:empId");
		query.setParameter("empId", theid);
		query.executeUpdate();
		
	}



	@Override
	public void save(Employee e) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(e);
		
	}

}
