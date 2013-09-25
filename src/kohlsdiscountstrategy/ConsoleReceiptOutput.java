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
    private StringBuilder stringBuilder = new StringBuilder();
    
    
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
    NumberFormat numberFormatter = NumberFormat.getNumberInstance();
        
    
    private void addLineItem(String productNumber, String description,
			String unitCost, String quantityPurchased, String discount, String subTotal) {

		stringBuilder.append(padRight(productNumber, 14));
		stringBuilder.append(padRight(description, 25));
		stringBuilder.append(padLeft(unitCost, 13));
		stringBuilder.append(padLeft(quantityPurchased, 12));
		stringBuilder.append(padLeft(discount, 12));
		stringBuilder.append(padLeft(subTotal, 15));

	}
    
    public static String padRight(String s, int n) {
		return String.format("%1$-" + n + "s", s);
	}

    public static String padLeft(String s, int n) {
		return String.format("%1$#" + n + "s", s);
	}

    @Override
    public String buildReceipt(TransactionReceipt receipt) {
        stringBuilder.append("Customer Name: \t ").append(transactionReceipt.getKohlsCustomer().getFullName());
        stringBuilder.append("\n");
        stringBuilder.append("Customer Number: \t").append(transactionReceipt.getKohlsCustomer().getCustomerNumber());
        stringBuilder.append("\n");
        stringBuilder.append("\n");
        addLineItem("Product Number", "Description", "Unit Cost", "Quantity Purchased","Discount Amount", "Sub-Total");
        addLineItem("-------------", "-----------------", "-------", "----","-----------", "-----------");
        stringBuilder.append("\n");
        
        for (LineItem item : transactionReceipt.getLineItems()) {
		String productNumber = item.getProduct().getProductNumber();
		String description = item.getProduct().getProductDescription();
		String unitCost = currencyFormatter.format(item.getProduct().getProductUnitPrice());
		String quantity = numberFormatter.format(item.getItemQuantity());
		String discount = currencyFormatter.format(item.getDiscountAmount());
		String subTotal = currencyFormatter.format(item.getSubTotal());

		addLineItem(productNumber, description, unitCost, quantity, discount,subTotal);
		stringBuilder.append("\n");
                
		}
        String orderTotal = currencyFormatter.format(transactionReceipt.getTransactionTotal());
        
        stringBuilder.append("\n");
	stringBuilder.append("\n");
	addLineItem("", "", "", "", "", "Grand Total");
	stringBuilder.append("\n");
	addLineItem("", "", "", "", "", "-----------");
	stringBuilder.append("\n");
	addLineItem("", "", "", "", "", orderTotal);

	return stringBuilder.toString();
    }
    
    
}
