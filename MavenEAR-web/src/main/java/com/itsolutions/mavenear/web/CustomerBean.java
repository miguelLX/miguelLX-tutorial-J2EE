package com.itsolutions.mavenear.web;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.itsolutions.mavenear.model.ejbs.CustomerEJB;
import com.itsolutions.mavenear.model.entities.Customer;

@ManagedBean(name="customer")
@SessionScoped
public class CustomerBean {

    @EJB
    CustomerEJB customerEjb;

    private List<Customer> customerList = new ArrayList<Customer>();

    public List<Customer> getCustomerList() {
        customerList = customerEjb.findAll();
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

}
