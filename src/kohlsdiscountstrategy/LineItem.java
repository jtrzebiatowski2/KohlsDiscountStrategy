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

    public LineItem(Product product, int itemQuantity, double linePriceTotal) {
        this.product = product;
        this.itemQuantity = itemQuantity;
        this.linePriceTotal = linePriceTotal;
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
