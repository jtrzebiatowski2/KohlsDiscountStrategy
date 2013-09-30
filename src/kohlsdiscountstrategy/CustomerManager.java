/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscountstrategy;

/**
 *
 * @author J-Tron
 */
public class CustomerManager {
    
    private Customer [] customers;
    private final String REQUIRED_FIELD_ERROR_MESSAGE = "The fields may not be blank";
    
    public CustomerManager(){
        customers = new Customer[0];
    }
    
    public Customer[] getCustomer(){
        return customers;
    }
    
    public void addNewCustomer(String firstName, String lastName, String customerNumber){
        
    if(firstName == null || lastName == null || customerNumber == null) {
            throw new IllegalArgumentException(REQUIRED_FIELD_ERROR_MESSAGE);
        }
        Customer customer = new Customer(firstName, lastName, customerNumber);
        Customer[] temp = new Customer[customers.length + 1];
        System.arraycopy(customers, 0, temp, 0, customers.length);
        customers = temp;
        customers[customers.length-1] = customer;
    }
    
    public Customer findCustomerByCustomerNumber(String customerNumber){
        if(customerNumber == null || customerNumber.length() == 0) {
            throw new IllegalArgumentException(REQUIRED_FIELD_ERROR_MESSAGE);
        }
            Customer customer = null;
            
              for(Customer kc : customers) {
                if(kc.getCustomerNumber().equalsIgnoreCase(customerNumber)) {
                customer = kc;
                break;
            }
    } 
        return customer; 
    }
    
    
 }
    

