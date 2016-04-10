
/**
 * Ticket object.
 * 
 * @author Dillingham, Jace
 * @version 4/12/16
 */
public class Ticket
{
    private Customer customer;
    private Flight flight;
    /**
     * Ticket object.
     * @param customer variable for customer.
     * @param flight variable for flight.
     */
    public Ticket(Customer customer, Flight flight)
    {
        Customer alpha = new Customer(customer);
        alpha.setName(customer.getName());
        alpha.setSsn(customer.getSsn());
        flight = flight.copy();
    }
    /**
     * Customer object.
     * @return customer to return customer information.
     */
    public Customer getCustomer()
    {
        return customer;
    }
    /**
     * mutator for Customer.
     * @param customer variable for customer.
     */
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    /**
     * accessor for flight.
     * @return flight to return flight variable.
     */
    public Flight getFlight()
    {
        return flight;
    }
    /**
     * mutator for flight information.
     * @param flight variable for flight.
     */
    public void setFlight(Flight flight)
    {
        flight = flight.copy();
    }
    /**
     * toString no clue.
     * @return string to return string value.
     */
    public String toString()
    {
        String ticket1 = String.ticket1(
                "******** TICKET ********\n"
                + "* Name: " + name + "\n"
                + " *SSN: " + ssn + "\n"
                + "* Flight: " + flightNumber + "\n"
                + "* Date: " + date + "\n"
                + "* Destination: " + destination + "\n"
                + "************************");
                
        return string;
    }
}
