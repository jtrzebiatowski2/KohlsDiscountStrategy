/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscountstrategy;

/**
 *
 * @author J-Tron
 */
public class KohlsCustomerManager {
    
    private Customer [] kohlsCustomers;
    private final String requiredFieldsErrorMessage = "The fields may not be blank";
    
    public KohlsCustomerManager(){
        kohlsCustomers = new Customer[0];
    }
    
    public Customer[] getCustomer(){
        return kohlsCustomers;
    }
    
    public void addNewKohlsCustomer(String firstName, String lastName, String customerNumber){
        
    if(firstName == null || lastName == null || customerNumber == null) {
            throw new IllegalArgumentException(requiredFieldsErrorMessage);
        }
        Customer kohlsCustomer = new Customer(firstName, lastName, customerNumber);
        Customer[] temp = new Customer[kohlsCustomers.length + 1];
        System.arraycopy(kohlsCustomers, 0, temp, 0, kohlsCustomers.length);
        kohlsCustomers = temp;
        kohlsCustomers[kohlsCustomers.length-1] = kohlsCustomer;
    }
    
    public Customer findCustomerByCustomerNumber(String customerNumber){
        if(customerNumber == null || customerNumber.length() == 0) {
            throw new IllegalArgumentException(requiredFieldsErrorMessage);
        }
            Customer kohlsCustomer = null;
            
              for(Customer kc : kohlsCustomers) {
                if(kc.getCustomerNumber().equalsIgnoreCase(customerNumber)) {
                kohlsCustomer = kc;
                break;
            }
    } 
        return kohlsCustomer; 
    }
    
    
 }
    

