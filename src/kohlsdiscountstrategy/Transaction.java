/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscountstrategy;

/**
 *
 * @author J-Tron
 */
public interface Transaction {
    public abstract void findCustomer(String customerNumber);
    public abstract void addItem(int itemNumber, int itemQuantity);
    
}
