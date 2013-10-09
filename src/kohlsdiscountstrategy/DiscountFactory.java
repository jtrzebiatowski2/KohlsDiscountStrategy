/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlsdiscountstrategy;

/**
 *
 * @author J-Tron
 */
public class DiscountFactory {
    public static enum Discounts{
        HALF_OFF, THIRTY_PERCENT_OFF, NO_DISCOUNT
    }
    
    private static DiscountFactory instance;

    private DiscountFactory() {
    }
    
    
     public static DiscountFactory getInstance() {
         if(instance == null) {
            instance = new DiscountFactory();
         }
         return instance;
    }
     
     public ProductDiscountStrategy getDiscountStrategy(Discounts discountType){
         ProductDiscountStrategy pds = null;
         
         switch (discountType){
             case HALF_OFF:
                 pds = new HalfOffDiscount();
                 break;
                 
             case THIRTY_PERCENT_OFF:
                 pds = new ThirtyPercentOffDiscount();
                 break;
                 
             case NO_DISCOUNT:
                 pds = new NoDiscount();
                 break;
         }
         
         return pds;
             
     }
    
}
