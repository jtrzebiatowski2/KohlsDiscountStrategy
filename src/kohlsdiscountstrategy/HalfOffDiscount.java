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
    @Override
    public void calculateDiscount(String productNumber, int quantityPurchased) {
        discountPrice = (product.getProductUnitPrice() * quantityPurchased)/2;
    }
    
    public double getDiscount(){
        return discountPrice;
    }
    
}
