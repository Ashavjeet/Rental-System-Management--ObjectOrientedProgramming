/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeAndCustomerManagement;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class CustomerList {
    
     public static ArrayList<Customer> cus = new ArrayList<>();
     
     

    public static void addCustomer(Customer customer){
        cus.add(customer);
    }
       
        
}
