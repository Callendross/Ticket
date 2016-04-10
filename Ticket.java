
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
        this.flight = flight.copy();
        setCustomer(alpha);
    }

    /**
     * accessor for Customer.
     * @return customer to return customer information.
     */
    public Customer getCustomer()
    {
        return new Customer(customer);
    }

    /**
     * mutator for Customer.
     * @param customer variable for customer.
     */
    public void setCustomer(Customer customer)
    {
        this.customer = new Customer(customer);
    }

    /**
     * accessor for flight.
     * @return flight to return flight variable.
     */
    public Flight getFlight()
    {
        return flight.copy();
    }

    /**
     * mutator for flight information.
     * @param flight variable for flight.
     */
    public void setFlight(Flight flight)
    {
        this.flight = flight.copy();
    }

    /**
     * toString no clue.
     * @return string to return string value.
     */
    public String toString()
    {
        String ticket1 = String.format("******** TICKET ********\n"
            + "* Name: " + customer.getName() + "\n"
            + "* SSN: " + customer.getSsn() + "\n"
            + "* Flight: " + flight.getFlightNumber() + "\n"
            + "* Date: " + flight.getDate() + "\n"
            + "* Destination: " + flight.getDestination() + "\n"
            + "************************");

        return ticket1;
    }
}
