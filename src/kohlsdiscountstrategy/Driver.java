/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscountstrategy;

/**
 *
 * @author J-Tron
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CashRegister register1 = new CashRegister();
       
       register1.startNewSale("A1");
       register1.addItemToPurchase("1", 3);
       register1.addItemToPurchase("5", 1);
       register1.addItemToPurchase("7", 2);
       register1.addItemToPurchase("10", 2); 
       
       register1.printReceipt();
       
       CashRegister register2 = new CashRegister();
       
       register2.startNewSale("A6");
       register2.addItemToPurchase("4", 3);
       register2.addItemToPurchase("8", 2);
       register2.addItemToPurchase("10", 8);
       
       register2.printReceipt();
       
        
        
    }
}
