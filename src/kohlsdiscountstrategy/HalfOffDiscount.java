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
    private final double discountValueInitializer = 0.0;
    private final double halfOffValue = .50;
    
    @Override
    public double calculateDiscount(double unitCost, double quantityPurchased) {
         double discount = discountValueInitializer;
         
         discount = (unitCost * quantityPurchased) * halfOffValue;
        
        return discount;
    }
    
}
