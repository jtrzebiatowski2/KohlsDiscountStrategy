/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscountstrategy;

/**
 *
 * @author J-Tron
 */
public class CashRegister {
    private ReceiptOutputStrategy consoleOutput;
    private TransactionReceipt transactionReceipt;
    
    public CashRegister(){ 
        consoleOutput = new ConsoleReceiptOutput();
    }
    
    public void startNewSale(String customerNumber){
        
        this.transactionReceipt = new TransactionReceipt(customerNumber);
      
    }
    
    public void addItemToPurchase(String productNumber, int quantityPurchased){
        transactionReceipt.addLineItem(productNumber, quantityPurchased);
    }
    
    public void printReceipt(){
        consoleOutput.outputReceipt(transactionReceipt);
    }
    
}
