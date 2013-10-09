package kohlsdiscountstrategy;

/**
 *
 * @author J-Tron
 */
public class ReceiptOutputFactory {
    public static enum Outputs{
        CONSOLE, GUI
    }
    
    private static ReceiptOutputFactory instance;

    private ReceiptOutputFactory() {
    }
    
    public static ReceiptOutputFactory getInstance(){
        if (instance == null){
            instance = new ReceiptOutputFactory();
        }
        return instance;
    }
    
     public ReceiptOutputStrategy getReceiptOutput(Outputs outputType) {
        ReceiptOutputStrategy ros = null;
        
        switch(outputType) {
            case CONSOLE:
                ros = new ConsoleReceiptOutput();
                break;
            case GUI:
                ros = new GUIReceiptOutput();
                break;
        }
        
        return ros;
    }
    
}
