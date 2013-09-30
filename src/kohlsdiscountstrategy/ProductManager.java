/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscountstrategy;

/**
 *
 * @author J-Tron
 */
public class ProductManager {
    private ProductDiscountStrategy discount;
    private Product [] products;
    private final String REQUIRED_FIELDS_ERROR_MESSAGE = "The fields may not be blank";
    private final String PRICE_OUT_OF_RANGE_MESSAGE = "Check that price again";
    
    public ProductManager(){
        products = new Product[0];
    }
    
    public Product[] getProduct(){
        return products;
    }
    
    public void addNewProduct(String productNumber, String productDescription, double productUnitPrice){
        
    if(productNumber == null) {
        throw new IllegalArgumentException(REQUIRED_FIELDS_ERROR_MESSAGE);
        }
    if(productDescription == null){
        throw new IllegalArgumentException(REQUIRED_FIELDS_ERROR_MESSAGE);
    }
    if(productUnitPrice < .01 || productUnitPrice > 10000.00){
        throw new IllegalArgumentException(PRICE_OUT_OF_RANGE_MESSAGE);
    }
    
        Product product = new Product(productNumber, productDescription, productUnitPrice, discount);
        Product[] temp = new Product[products.length + 1];
        System.arraycopy(products, 0, temp, 0, products.length);
        products = temp;
        products[products.length-1] = product;
    }
    
    public Product findProduct(int productNumber){
        if(productNumber < 1) {
            throw new IllegalArgumentException(REQUIRED_FIELDS_ERROR_MESSAGE);
        }
            Product product = null;
            
              for(Product p : products) {
                if((p.getProductNumber()).equals(productNumber));
                {
                product = p;
                break;
                }
    } 
        return product; 
    }
}
