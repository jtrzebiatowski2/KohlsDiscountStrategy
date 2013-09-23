/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscountstrategy;

/**
 *
 * @author J-Tron
 */
public class Product {
    private int productNumber;
    private String productDescription;
    private double productUnitPrice;
    private final String nullErrorMessage = "This field may not be blank";
    private final String priceOutOfRangeMessage = "Check that price again";
   

    public Product(int productNumber, String productDescription, double productUnitPrice) {
        this.productNumber = productNumber;
        this.productDescription = productDescription;
        this.productUnitPrice = productUnitPrice;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
        if(productDescription.length() < 1 || productDescription == null)
        {
            System.out.println(nullErrorMessage);
        }
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
        if(productNumber < 1)
        {
            System.out.println(nullErrorMessage);
        }
    }

    public void setProductUnitPrice(double productUnitPrice) {
        this.productUnitPrice = productUnitPrice;
        if(productUnitPrice < .01 || productUnitPrice > 10000.00)
        {
            System.out.println(priceOutOfRangeMessage);
        }
    }

    public String getProductDescription() {
        return productDescription;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public double getProductUnitPrice() {
        return productUnitPrice;
    }
  
    
    
  
}
