/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscountstrategy;

/**
 *
 * @author J-Tron
 */
public class SalesTransaction implements Transaction {
    
private KohlsCustomerManager kohlsCustomerManager;
private KohlsCustomer kohlsCustomer;
private Product product;
private ProductManager productManger;

    public SalesTransaction(KohlsCustomer kohlsCustomer) {
        this.kohlsCustomer = kohlsCustomer;  
    }
    
    @Override
    public void findCustomer(String customerNumber) {
        kohlsCustomerManager = new KohlsCustomerManager();
        kohlsCustomer = kohlsCustomerManager.findCustomerByCustomerNumber(customerNumber);
    }

    @Override
    public void addItem(int itemNumber, int itemQuantity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
