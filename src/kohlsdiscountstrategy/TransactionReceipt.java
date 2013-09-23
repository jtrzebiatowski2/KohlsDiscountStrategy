/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscountstrategy;

/**
 *
 * @author J-Tron
 */
public class TransactionReceipt {
    private LineItem[] lineItems;
    private KohlsCustomerManager kohlsCustomerManager;
    private KohlsCustomer kohlsCustomer;
    private Product product;
    private ProductManager productManager;
    private double lineItemPrice;

    public TransactionReceipt(String customerNumber, LineItem[] lineItems) {
        kohlsCustomerManager = new KohlsCustomerManager();
        kohlsCustomer = kohlsCustomerManager.findCustomerByCustomerNumber(customerNumber);
        
    }
    
}
