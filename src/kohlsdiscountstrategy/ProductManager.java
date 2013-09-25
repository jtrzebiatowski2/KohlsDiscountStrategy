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
    private Product [] products;
    private final String requiredFieldsErrorMessage = "The fields may not be blank";
    private final String priceOutOfRangeMessage = "Check that price again";
    
    public ProductManager(){
        products = new Product[0];
    }
    
    public Product[] getProduct(){
        return products;
    }
    
    public void addNewProduct(int productNumber, String productDescription, double productUnitPrice){
        
    if(productNumber < 1) {
        throw new IllegalArgumentException(requiredFieldsErrorMessage);
        }
    if(productDescription == null){
        throw new IllegalArgumentException(requiredFieldsErrorMessage);
    }
    if(productUnitPrice < .01 || productUnitPrice > 10000.00){
        throw new IllegalArgumentException(priceOutOfRangeMessage);
    }
    
        Product product = new Product(productNumber, productDescription, productUnitPrice);
        Product[] temp = new Product[products.length + 1];
        System.arraycopy(products, 0, temp, 0, products.length);
        products = temp;
        products[products.length-1] = product;
    }
    
    public Product findProduct(int productNumber){
        if(productNumber < 1) {
            throw new IllegalArgumentException(requiredFieldsErrorMessage);
        }
            Product product = null;
            
              for(Product p : products) {
                if((p.getProductNumber()) == productNumber) {
                product = p;
                break;
            }
    } 
        return product; 
    }
}
