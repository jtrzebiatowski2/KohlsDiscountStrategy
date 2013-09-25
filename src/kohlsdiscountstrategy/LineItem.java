/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscountstrategy;

/**
 *
 * @author J-Tron
 */
public class LineItem {
    private Product product;
    private double itemQuantity;
    private double subTotal;
    private double discountAmount;
    private final String productQuantityRequiredMessage = "Enter a valid quantity";

    public LineItem(String productNumber, double quantityPurchased) {
        product = ProductAndCustomerDatabase.findProduct(productNumber);
        setItemQuantity(quantityPurchased);
        setDiscount(calculateDiscount());
        setSubTotal(calculateSubTotal());
    }

    public LineItem(Product product, double itemQuantity) {
        this.product = product;
        this.itemQuantity = itemQuantity;
    }
    
    public void setItemQuantity(double itemQuantity) {
        this.itemQuantity = itemQuantity;
        if(itemQuantity < 1 || itemQuantity > 500){
            throw new IllegalArgumentException(productQuantityRequiredMessage);
        }
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public final void setDiscount(double discountAmount) {
		this.discountAmount = discountAmount;
	}
    private final double calculateDiscount() {

        double unitCost = product.getProductUnitPrice();
	return product.getDiscount().calculateDiscount(unitCost,
				itemQuantity);
	}
    
    private final void setSubTotal(double subTotal){
        this.subTotal = subTotal;
    }
    
    private final double calculateSubTotal(){
        double unitCost = product.getProductUnitPrice();
        
        return unitCost * itemQuantity - discountAmount;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public Product getProduct() {
        return product;
    }

    public double getItemQuantity() {
        return itemQuantity;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
