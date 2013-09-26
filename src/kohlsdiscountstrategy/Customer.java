package kohlsdiscountstrategy;

/**
 *
 * @author J-Tron
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String customerNumber;
    private final String nullErrorMessage = "This field may not be blank";

    public Customer(String firstName, String lastName, String customerNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerNumber = customerNumber;
    }

    public Customer() {
    }

    public void setCustomerNumer(String customerNumber) {
        this.customerNumber = customerNumber;
        if(customerNumber.length() < 1 || customerNumber == null)
        {
            System.out.println(nullErrorMessage);
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        if(firstName.length() < 1 || firstName == null)
        {
            System.out.println(nullErrorMessage);
        }
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        if(lastName.length() < 1 || lastName == null)
        {
            System.out.println(nullErrorMessage);
        }
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
