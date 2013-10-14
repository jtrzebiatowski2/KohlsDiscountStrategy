/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscountstrategy;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author J-Tron
 */
public class TransactionReceipt {
    private LineItem[] purchasedItems;
    private Customer cutomer;
    private double transactionTotal;
    private final double ZERO_PRICE = 0.0;
    private String vendor; 
    private String dateFormat = "M/d/yyyy hh:mm a";
    
    

    public TransactionReceipt(String customerNumber) {
        vendor= "Kohls";
        Customer customer = ProductAndCustomerDatabase.findCustomer(customerNumber);
        setCustomer(customer);
        purchasedItems = new LineItem[0];
    }
    
    public final LineItem[] getLineItems(){
        return purchasedItems;
    }

    public Customer getCustomer() {
        return cutomer;
    }
    
    
    public final void setCustomer(Customer kohlscustomer){
    
        this.cutomer = kohlscustomer;
}
    
    public void setLineItems(LineItem[] purchasedItems){
        this.purchasedItems = purchasedItems;
    }
    
    public final void setTransactionTotal(double transactionTotal){
        this.transactionTotal = transactionTotal;
    }
    
    public final double getTransactionTotal(){
        return transactionTotal;
    }
    
    public final void zeroTransactionTotal(){
        double transactionTotal = ZERO_PRICE;
        
        for (LineItem lineItem : purchasedItems) {
			transactionTotal += lineItem.getSubTotal();
		}

		setTransactionTotal(transactionTotal);

	}
    public static LineItem[] addItem(LineItem[] array, LineItem item) {
		LineItem[] temp = new LineItem[array.length + 1];
		System.arraycopy(array, 0, temp, 0, array.length);
		temp[temp.length - 1] = item;
		return temp;
	}
           
    public void addLineItem(String productNumber, double quantityPurchased) {
        LineItem purchasedItem = new LineItem(productNumber, quantityPurchased);
        setLineItems(addItem(purchasedItems, purchasedItem));
        setTransactionTotal(getTransactionTotal() + purchasedItem.getSubTotal()); 
    }

    public LineItem[] getPurchasedItems() {
        return purchasedItems;
    }
    
    public String getFormattedDateTimeString(String dateFormat){
    Calendar c = Calendar.getInstance();
    Date date = c.getTime();
    SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
    String formattedDate = sdf.format(date);
    
    return formattedDate;
    }
    
    
    
 }
    

