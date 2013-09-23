/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscountstrategy;

/**
 *
 * @author J-Tron
 */
public interface ReceiptOutputStrategy {
    public abstract void printReceipt(TransactionReceipt receipt);
}
