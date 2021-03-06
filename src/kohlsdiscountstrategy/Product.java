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
    private ProductDiscountStrategy discount;
    private String productNumber;
    private String productDescription;
    private double productUnitPrice;
    private final String NULL_ERROR_MESSAGE = "This field may not be blank";
    private final String PRICE_OUT_OF_RANGE_MESSAGE = "Check that price again";
   

    public Product(String productNumber, String productDescription, double productUnitPrice, ProductDiscountStrategy discount) {
        this.productNumber = productNumber;
        this.productDescription = productDescription;
        this.productUnitPrice = productUnitPrice;
        this.discount = discount;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
        if(productDescription.length() < 1 || productDescription == null)
        {
            System.out.println(NULL_ERROR_MESSAGE);
        }
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
        if(productNumber == null)
        {
            System.out.println(NULL_ERROR_MESSAGE);
        }
    }

    public void setProductUnitPrice(double productUnitPrice) {
        this.productUnitPrice = productUnitPrice;
        if(productUnitPrice < .01 || productUnitPrice > 10000.00)
        {
            System.out.println(PRICE_OUT_OF_RANGE_MESSAGE);
        }
    }

    public ProductDiscountStrategy getDiscount() {
        return discount;
    }
    
    
    public void setDiscount(ProductDiscountStrategy discount){
        this.discount = discount;
    }
    

    public String getProductDescription() {
        return productDescription;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public double getProductUnitPrice() {
        return productUnitPrice;
    }
  
    
    
}

