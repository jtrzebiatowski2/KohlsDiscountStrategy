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
    private double discountValueInitializer = 0.0;
    private final double HALF_OFF_VALUE = .50;
    
    @Override
    public double calculateDiscount(double unitCost, double quantityPurchased) {
         double discount = discountValueInitializer;
         
         discount = (unitCost * quantityPurchased) * HALF_OFF_VALUE;
        
        return discount;
    }
    
}
