package com.itsolutions.mavenear.model.ejbs;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.itsolutions.mavenear.model.entities.Customer;

/**
 * Session Bean implementation class CustomerEJB
 */
@Stateless
@LocalBean
public class CustomerEJB {

    @PersistenceContext(unitName = "primary")
    EntityManager em;

    public List<Customer> customers = new ArrayList<Customer>();

    public List<Customer> findAll() {
        TypedQuery<Customer> query = em.createQuery("select c from Customer c", Customer.class);
        customers = query.getResultList();
        return customers;
    }

}
