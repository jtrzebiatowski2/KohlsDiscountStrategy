/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscountstrategy;

import java.text.NumberFormat;


/**
 *
 * @author J-Tron
 */
public class ConsoleReceiptOutput implements ReceiptOutputStrategy {
    private TransactionReceipt transactionReceipt;
    private String contentOutput = "";
    private String dateFormat = "M/d/yyyy hh:mm a";
    
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
    
    
    @Override
    public void outputReceipt(TransactionReceipt transactionReceipt) {
        String receipt = buildReceipt(transactionReceipt);
        System.out.println(receipt);
    }
    
    
    public String buildReceipt(TransactionReceipt transactionReceipt) {
        System.out.println("Customer Name:" + transactionReceipt.getCustomer().getFullName() + '\n' 
                + "Date: " + transactionReceipt.getFormattedDateTimeString(dateFormat) + '\n'
                + "Product" + '\t' + '\t' + "Description" + '\t' + "Unit Cost" + '\t' + "Quantity" + '\t' + "Discount" + '\t'
                + "Sub Total" + '\n' + 
               "*****************************************************************************************" + '\n'
                );
        
                for(LineItem item : transactionReceipt.getLineItems()){
                    String productNumber = item.getProduct().getProductNumber();
                    String description = item.getProduct().getProductDescription();
                    double unitCost = item.getProduct().getProductUnitPrice();
                    double quantityPurchased = item.getItemQuantity();
                    double discountAmount = item.getDiscountAmount();
                    double subTotal = item.getSubTotal();
                    
                    contentOutput += productNumber + '\t' + description + '\t' + '\t' + unitCost + '\t' + quantityPurchased +
                            '\t' + currencyFormatter.format(discountAmount) + '\t' + currencyFormatter.format(subTotal) + '\n';
                    
                }
                    
                  
                 return contentOutput 
                         + '\n'
                         + "--------------------------------------------------------------------------------------------"
                         + '\n'
                         + "                                                                                Grand Total"
                         +'\n'
                         + "---------------------------------------------------------------------------------------------"
                         +'\n'
                         + "                                                                                  " + (currencyFormatter.format(transactionReceipt.getTransactionTotal())
                         + '\n' + "Thanks for shopping at Kohls\n\n");
    }
}
    
    
    

