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
    private final double THIRTY_PERCENT_OFF_RATE = .30;
    private final double DISCOUNT_VALUE_INITIAIZER = 0.0;
    
    @Override
    public double calculateDiscount(double unitCost, double quantityPurchased) {
       double discount = DISCOUNT_VALUE_INITIAIZER;
       
       discount = (unitCost * quantityPurchased) * THIRTY_PERCENT_OFF_RATE;
       
       return discount;
    }
    
    
}
