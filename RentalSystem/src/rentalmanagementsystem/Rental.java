/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalmanagementsystem;

import EmployeeAndCustomerManagement.Customer;
import java.util.ArrayList;
import StockMaintenanceComponent.Guitar;
import StockMaintenanceComponent.GuitarList;
import EmployeeAndCustomerManagement.Customer;
import EmployeeAndCustomerManagement.CustomerList;
import static EmployeeAndCustomerManagement.CustomerList.cus;
import StockMaintenanceComponent.GuitarStatus;
import java.util.List;
import java.util.Date;



/**
 *
 * @author hp
 */
public class Rental {
   ArrayList<RentalGuitar> Rentalguitars = new ArrayList<RentalGuitar>();
   public  ArrayList<Guitar> guitarList;
   public  ArrayList<Customer> custList;
  
    public Rental(){
        custList = new ArrayList<Customer>();
         
        Customer cus1 = new Customer(101, "Ashu", 'M', 20, "5/2/2000", "Auckland, NewZealand", "888545597");
        Customer cus2 = new Customer(102, "Garry", 'M', 25, "15/5/1900", "Auckland, NewZealand", "888482597");
        Customer cus3 = new Customer(103, "Samah", 'F', 29, "3/6/1900", "Auckland, NewZealand", "8885235597");
        Customer cus4 = new Customer(104, "Reza", 'M', 30, "25/7/1900", "Auckland, NewZealand", "88648597");
        Customer cus5 = new Customer(105, "John", 'M', 36, "15/8/1990", "Auckland, NewZealand", "849655597");
        
        custList.add(cus1);
        custList.add(cus2);
        custList.add(cus3);
        custList.add(cus4);
        custList.add(cus5);
        
        guitarList = new ArrayList<Guitar>();
        
        Guitar g1 = new Guitar(201, "red", "42", GuitarStatus.Available);
        Guitar g2 = new Guitar(202, "black", "40", GuitarStatus.Available);
        Guitar g3 = new Guitar(203, "blue", "38", GuitarStatus.Available);
        Guitar g4 = new Guitar(204, "red", "42", GuitarStatus.Available);
        Guitar g5 = new Guitar(205, "white", "38", GuitarStatus.Available);
        guitarList.add(g1);
        guitarList.add(g2);
        guitarList.add(g3);
        guitarList.add(g4);
        guitarList.add(g5);
       
    }
    public  String RentGuitar(int serialNumber,int custID,Date date)
    {    
       for(Guitar guitar : guitarList){
            if(guitar.getSerialNumber()==serialNumber ){
                 if(guitar.getStatus()==GuitarStatus.Available){
                 
                for(int j=0;j<custList.size();j++){
                    if(custList.get(j).getCustomerId()==custID){
                     guitar.setStatus(GuitarStatus.Rented);
                     Rentalguitars.add(new RentalGuitar(custList.get(j),guitar,date));
                     return "You have successfully rented this guitar";
                    }
                }
                 }
                 else
                 return "This Guitar is not avaliable Now";
            }
        }
        return "This Guitar is not avaliable Now";
    }
    

    public  List<String> DisplayGuitarByCustomerName(String name){
       List<String> str = new ArrayList<String>();
       
        for(RentalGuitar guitar : Rentalguitars){        
            if(guitar.getCustomer().getName().equalsIgnoreCase(name)){
               str.add("Guitar serial Number: "+guitar.getGuitar().getSerialNumber() + ", Name :  " + guitar.getCustomer().getName() +", Rental Date :  " + guitar.getRentaldate());                                          
            }
        }
        return str;
      
    }
    
    public String returnGuitar(String customerName,int serialNo){
       
        if(Rentalguitars.size()==0){
            return null;
        }
         for(int j=0;j<Rentalguitars.size();j++){
                    
                if(Rentalguitars.get(j).getCustomer().getName().equalsIgnoreCase(customerName)){
                       
                    if(Rentalguitars.get(j).getGuitar().getSerialNumber()==serialNo){
                        
                        Rentalguitars.remove(j);
                        
                        for(int i=0;i<guitarList.size();i++){
                            
                            if(guitarList.get(i).getSerialNumber()==serialNo ){
                                
                                guitarList.get(i).setStatus(GuitarStatus.Available);
                                
                                return "You have successfully return this guitar";
            }
                }
                    }else{
                            return "There is no rented guitar with this id by this customer";
                        }
                }
         }
         
          
        return "There is no customer with this name who rented anything";
        

}
    
    
    
    
    public ArrayList<RentalGuitar> showBetweenDates(Date startDate,Date endDate){
        
        ArrayList<RentalGuitar> newList=new ArrayList<RentalGuitar>();
        
        int startDay, startMonth, startYear;
        int endDay, endMonth, endYear;
        
      
        startDay = startDate.getDay();
        startMonth = startDate.getMonth();
        startYear = startDate.getYear();
        endDay = endDate.getDay();
        endMonth = endDate.getMonth();
        endYear = endDate.getYear();

        for(RentalGuitar guitar: Rentalguitars){

            Date date = guitar.getRentaldate();
            if(startYear < date.getYear() && endYear > date.getYear()){
                newList.add(guitar);
            }
            else
                if(startYear == date.getYear() && endYear > date.getYear()){
                if(startMonth < date.getMonth()){
                    newList.add(guitar);
                }
                
                else
                    if(startMonth == date.getMonth()){
                    if(startDay < date.getDay()){
                        newList.add(guitar);
                    }
                }
            }
            else
                if(startYear < date.getYear() && endYear == date.getYear()){
                if(endMonth > date.getMonth()){
                    newList.add(guitar);
                }
                else
                    if(endMonth == date.getMonth()){
                    if(endDay > date.getDay()){
                        newList.add(guitar);   
                    }
                }
            }

        }
        
        return newList;
    }
}

 