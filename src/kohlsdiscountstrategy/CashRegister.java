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
    
    private ReceiptOutputStrategy output;
    private TransactionReceipt transactionReceipt;
    
    
    public CashRegister(){ 
        output = ReceiptOutputFactory
            .getInstance()
            .getReceiptOutput(ReceiptOutputFactory.Outputs.CONSOLE);
    }
    
    public void startNewSale(String customerNumber){
        
        this.transactionReceipt = new TransactionReceipt(customerNumber);
      
    }
    
    public void addItemToPurchase(String productNumber, int quantityPurchased){
        transactionReceipt.addLineItem(productNumber, quantityPurchased);
    }
    
    public void printReceipt(){
        output.outputReceipt(transactionReceipt);
    }
    
}
