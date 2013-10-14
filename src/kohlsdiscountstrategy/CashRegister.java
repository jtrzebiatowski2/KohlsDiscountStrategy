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
    
    
    public CashRegister(ReceiptOutputStrategy output){ 
        this.output = output;
    }
    
    public void startNewSale(String customerNumber)throws IllegalArgumentException{
        if(customerNumber == null){
            throw new IllegalArgumentException("Customer Number is required");
        }
        
        this.transactionReceipt = new TransactionReceipt(customerNumber);
      
    }
    
    public void addItemToPurchase(String productNumber, int quantityPurchased) throws IllegalArgumentException{
            if(productNumber == null || quantityPurchased < 0 ){
                throw new IllegalArgumentException("Enter required information");
            }
        transactionReceipt.addLineItem(productNumber, quantityPurchased);
    }
    
    public void printReceipt(){
        output.outputReceipt(transactionReceipt);
    }
    
}
