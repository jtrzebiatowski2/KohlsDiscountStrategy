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
    private int itemQuantity;
    private double linePriceTotal;
    private final String productQuantityRequiredMessage = "Enter a valid quantity";
    private ProductDiscountStrategy discountstrategyType;

    public LineItem(Product product, int itemQuantity, ProductDiscountStrategy discountStrategyType) {
        this.product = product;
        this.itemQuantity = itemQuantity;
        this.discountstrategyType = discountStrategyType;
    }

    public double getLinePriceTotal(LineItem item, ProductDiscountStrategy discountStrategyType){
        return discountStrategyType.calculateDiscount();
    }
    
    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
        if(itemQuantity < 1 || itemQuantity > 500){
            throw new IllegalArgumentException(productQuantityRequiredMessage);
        }
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    
}
