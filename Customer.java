
/**
 * Customer Information Object.
 * 
 * @author Dillingham, Jace
 * @version 4/12/16
 */
public class Customer
{
    private String name;
    private String ssn;
    /**
     * Customer info object.
     * @param name variable for customer's name.
     * @param ssn variable for customer's social security number.
     */
    public Customer(String name, String ssn)
    {
        this.name = name;
        this.ssn = ssn;
    }

    /**
     * Customer object.
     * @param customer no clue.
     */
    public Customer(Customer customer)
    {
        name = customer.name;
        ssn = customer.ssn;
    }

    /**
     * accessor for name.
     * @return for name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * mutator for name.
     * @param name variable for name.
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * accessor for social security number.
     * @return for ssn.
     */
    public String getSsn()
    {
        return ssn;
    }

    /**
     * mutator for social security number.
     * @param ssn variable for social security number.
     */
    public void setSsn(String ssn)
    {
        this.ssn = ssn;
    }

    /**
     * toString.
     * @return for string to be returned.
     */
    public String toString()
    {
        String customer1 = String.format(
                "Name: " + name + " - SSN: " + ssn);
        return customer1;
    }
}
