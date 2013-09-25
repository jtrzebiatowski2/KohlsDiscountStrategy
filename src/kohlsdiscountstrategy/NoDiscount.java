/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscountstrategy;

/**
 *
 * @author J-Tron
 */
public class NoDiscount implements ProductDiscountStrategy {

    private Product product;
    private double discountPrice;
    private int quantityPurchased;

    public NoDiscount(Product product, int quantityPurchased) {
        this.product = product;
        this.quantityPurchased = quantityPurchased;
    }
    
    @Override
    public double calculateDiscount() {
        return discountPrice = (product.getProductUnitPrice()) * quantityPurchased;
        
    }
 
    public double getDiscount(){
        return discountPrice;
    }
    
}
