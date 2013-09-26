/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscountstrategy;

/**
 *
 * @author J-Tron
 */
public class TransactionReceipt {
    private LineItem[] purchasedItems;
    private Customer cutomer;
    private double transactionTotal;
    private final double zeroPrice = 0.0;
    private String vendor; // consider using this

    public TransactionReceipt(String customerNumber) {
        
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
        double transactionTotal = zeroPrice;
        
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
    
    
 }
    

