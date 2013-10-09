/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscountstrategy;

/**
 *
 * @author J-Tron
 */
public class ProductAndCustomerDatabase {
            
    public static final Product[] PRODUCTS = new Product[10];
    public static final Customer[] CUSTOMERS = new Customer[10];
    
    static{
        PRODUCTS[0] = new Product("1", "400 Thread Count Queen Sheets", 49.99, new NoDiscount());
        PRODUCTS[1] = new Product("2", "Pumpkin Candle", 12.99, new ThirtyPercentOffDiscount());
        PRODUCTS[2] = new Product("3", "Boys sz 13 Spiderman Shirt", 10.49, new HalfOffDiscount());
        PRODUCTS[3] = new Product("4", "Men's sz 12 Loafers", 79.99, new NoDiscount());
        PRODUCTS[4] = new Product("5", "Rachel Ray 12 inch frying pan", 89.99, new ThirtyPercentOffDiscount());
        PRODUCTS[5] = new Product("6", "Juniors sz 3 hip flare pant", 29.99, new HalfOffDiscount());
        PRODUCTS[6] = new Product("7", "Apt 9 fashion tie", 23.99, new NoDiscount());
        PRODUCTS[7] = new Product("8", "Men's Hanes white A-shirt 3 count", 14.99, new HalfOffDiscount());
        PRODUCTS[8] = new Product("9", "Fashion Plus Silverware set", 99.99, new ThirtyPercentOffDiscount());
        PRODUCTS[9] = new Product("10", "Girl's 10 pack socks", 13.99, new HalfOffDiscount());
        
        CUSTOMERS[0] = new Customer("Jill", "Rock", "A1");
        CUSTOMERS[1] = new Customer("Dave", "Klinke", "A2");
        CUSTOMERS[2] = new Customer("Bob", "Hope", "A3");
        CUSTOMERS[3] = new Customer("Frank", "Niles", "A4");
        CUSTOMERS[4] = new Customer("Helen", "Forset", "A5");
        CUSTOMERS[5] = new Customer("Julie", "Alvarez", "A6");
        CUSTOMERS[6] = new Customer("Mary", "Drews", "A7");
        CUSTOMERS[7] = new Customer("George", "Jenkins", "A8");
        CUSTOMERS[8] = new Customer("Manny", "Little", "A9");
        CUSTOMERS[9] = new Customer("Victoria", "Sartino", "A10");
    }
    
    public static Customer findCustomer(String customerId) {

		Customer searchedCustomer = null;

		for (Customer customer : CUSTOMERS) {
			if (customerId.equals(customer.getCustomerNumber())) {
				searchedCustomer = customer;
				break;
			}
		}

		return searchedCustomer;

	}
    
     public static Product findProduct(String productNumber) {

		Product searchedProduct = null;

		for (Product product : PRODUCTS) {
			if ((productNumber).equals(product.getProductNumber())) {
				searchedProduct = product;
				break;
			}
		}

		return searchedProduct;

	}
}

