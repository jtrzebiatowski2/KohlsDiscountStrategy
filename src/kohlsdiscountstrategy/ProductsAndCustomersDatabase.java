/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscountstrategy;

/**
 *
 * @author J-Tron
 */
public class ProductsAndCustomersDatabase {
    public static final Product[] products = new Product[9];
    public static final KohlsCustomer[] customers = new KohlsCustomer[9];
    
    static{
        products[0] = new Product("1", "400 Thread Count Queen Sheets", 49.99, new NoDiscount());
        products[1] = new Product("2", "Pumpkin Candle", 12.99, new ThirtyPercentOffDiscount());
        products[2] = new Product("3", "Boys sz 13 Spiderman Shirt", 10.49, new HalfOffDiscount());
        products[3] = new Product("4", "Men's sz 12 Loafers", 79.99, new NoDiscount());
        products[4] = new Product("5", "Rachel Ray 12 inch frying pan", 89.99, new ThirtyPercentOffDiscount());
        products[5] = new Product("6", "Juniors sz 3 hip flare pant", 29.99, new HalfOffDiscount());
        products[6] = new Product("7", "Apt 9 fashion tie", 23.99, new NoDiscount());
        products[7] = new Product("8", "Men's Hanes white A-shirt 3 count", 14.99, new HalfOffDiscount());
        products[8] = new Product("9", "Fashion Plus Silverware set", 99.99, new ThirtyPercentOffDiscount());
        products[9] = new Product("10", "Girl's 10 pack socks", 13.99, new NoDiscount());
        
        customers[0] = new KohlsCustomer("Jill", "Rock", "A1");
        customers[1] = new KohlsCustomer("Dave", "Klinke", "A2");
        customers[2] = new KohlsCustomer("Bob", "Hope", "A3");
        customers[3] = new KohlsCustomer("Frank", "Niles", "A4");
        customers[4] = new KohlsCustomer("Helen", "Forset", "A5");
        customers[5] = new KohlsCustomer("Julie", "Alvarez", "A6");
        customers[6] = new KohlsCustomer("Mary", "Drews", "A7");
        customers[7] = new KohlsCustomer("George", "Jenkins", "A8");
        customers[8] = new KohlsCustomer("Manny", "Little", "A9");
        customers[9] = new KohlsCustomer("Victoria", "Sartino", "A10");
    }
}

