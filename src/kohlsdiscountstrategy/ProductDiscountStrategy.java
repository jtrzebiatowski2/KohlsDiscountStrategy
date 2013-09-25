/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscountstrategy;

/**
 *
 * @author J-Tron
 */
public interface ProductDiscountStrategy {
    /**
     *
     * @param unitCost
     * @param quantityPurchased
     * @return
     */
    public abstract double calculateDiscount(double unitCost, double quantityPurchased);
}
