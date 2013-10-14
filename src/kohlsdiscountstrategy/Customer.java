package kohlsdiscountstrategy;

/**
 *
 * @author J-Tron
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String customerNumber;
    private final String NULL_ERROR_MESSAGE = "This field may not be blank";

    public Customer(String firstName, String lastName, String customerNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerNumber = customerNumber;
    }

    public Customer() {
    }

    public void setCustomerNumer(String customerNumber) throws IllegalArgumentException {
        
        if(customerNumber.length() < 1 || customerNumber == null)
        {
            throw new IllegalArgumentException(NULL_ERROR_MESSAGE);
        }
        this.customerNumber = customerNumber;
    }

    public void setFirstName(String firstName) throws IllegalArgumentException {
        
        if(firstName.length() < 1 || firstName == null)
        {
            throw new IllegalArgumentException(NULL_ERROR_MESSAGE);
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) throws IllegalArgumentException {
        
        if(lastName.length() < 1 || lastName == null)
        {
            throw new IllegalArgumentException(NULL_ERROR_MESSAGE);
        }
        this.lastName = lastName;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    /**
     *
     * @return
     */
    public String getFullName(){
        return firstName + " " + lastName;
    }
    
    
}
