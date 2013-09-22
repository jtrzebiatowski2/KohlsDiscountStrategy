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
    
    private KohlsCustomer [] kohlsCustomers;
    private final String requiredFieldsErrorMessage = "The fields may not be blank";
    
    public KohlsCustomerManager(){
        kohlsCustomers = new KohlsCustomer[0];
    }
    
    public KohlsCustomer[] getCustomer(){
        return kohlsCustomers;
    }
    
    public void addNewKohlsCustomer(String firstName, String lastName, String customerNumber){
        
    if(firstName == null || lastName == null || customerNumber == null) {
            throw new IllegalArgumentException(requiredFieldsErrorMessage);
        }
        KohlsCustomer kohlsCustomer = new KohlsCustomer(firstName, lastName, customerNumber);
        KohlsCustomer[] temp = new KohlsCustomer[kohlsCustomers.length + 1];
        System.arraycopy(kohlsCustomers, 0, temp, 0, kohlsCustomers.length);
        kohlsCustomers = temp;
        kohlsCustomers[kohlsCustomers.length-1] = kohlsCustomer;
    }
    
    public KohlsCustomer findCustomerByCustomerNumber(String customerNumber){
        if(customerNumber == null || customerNumber.length() == 0) {
            throw new IllegalArgumentException(requiredFieldsErrorMessage);
        }
            KohlsCustomer kohlsCustomer = null;
            
              for(KohlsCustomer kc : kohlsCustomers) {
                if(kc.getCustomerNumber().equalsIgnoreCase(customerNumber)) {
                kohlsCustomer = kc;
                break;
            }
    } 
        return kohlsCustomer; 
    }
    
    
 }
    

