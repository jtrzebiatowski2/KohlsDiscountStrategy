/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscountstrategy;

/**
 *
 * @author J-Tron
 */
public class HalfOffDiscount implements ProductDiscountStrategy{
    private Product product;
    private double discountPrice;
    private double quantityPurchased;

    public HalfOffDiscount(Product product, double quantityPurchased) {
        this.product = product;
        this.quantityPurchased = quantityPurchased;
    }
    
    @Override
    public double calculateDiscount() {
        return discountPrice = (product.getProductUnitPrice() * quantityPurchased)/2;
    }
    
    public double getDiscount(){
        return discountPrice;
    }
    
}
