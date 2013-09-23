/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscountstrategy;

/**
 *
 * @author J-Tron
 */
public class ConsoleReceiptOutput implements ReceiptOutputStrategy {
    private TransactionReceipt transactionReceipt;
    
    @Override
    public void printReceipt(TransactionReceipt transactionReceipt) {
        System.out.print(transactionReceipt);
    }
    
}
