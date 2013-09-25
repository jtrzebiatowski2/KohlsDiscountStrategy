/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscountstrategy;

/**
 *
 * @author J-Tron
 */
public class ThirtyPercentOffDiscount implements ProductDiscountStrategy{
    private final double thirtyPercentOffRate = .70;
    private final double discountValueInitializer = 0.0;
    
    @Override
    public double calculateDiscount(double unitCost, double quantityPurchased) {
       double discount = discountValueInitializer;
       
       discount = (unitCost * quantityPurchased) * thirtyPercentOffRate;
       
       return discount;
    }
    
    
}
