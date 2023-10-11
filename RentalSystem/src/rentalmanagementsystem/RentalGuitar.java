/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmanagementsystem;

import EmployeeAndCustomerManagement.Customer;
import StockMaintenanceComponent.Guitar;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hp
 */
public class RentalGuitar {
       private Customer customer;
       private Guitar guitar;
       private Date Rentaldate;
     
     public RentalGuitar(Customer customer,Guitar guitar,Date date){
        this.customer=customer;
        this.guitar=guitar;
        this.Rentaldate= new Date();
     }

    public Customer getCustomer() {
        return customer;
    }

    public Guitar getGuitar() {
        return guitar;
    }  
    
    public Date getRentaldate() {
        return Rentaldate;
   
     
}
}