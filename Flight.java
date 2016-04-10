
/**
 * Flight object.
 * 
 * @author Dillingham, Jace
 * @version 4/12/16
 */
public class Flight
{
    private int flightNumber;
    private String destination;
    private Pilot pilot;
    private String date;
    /**
     * Flight object.
     * 
     */
    public Flight()
    {
        flightNumber = 0;
        destination = "The Grid";
        Pilot p = new Pilot();
        setPilot(p);
        date = "07/09/1982";
    }
    /**
     * Flight object.
     * @param flightNumber variable for Flight number.
     * @param destination variable for flight's destination.
     * @param pilot variable for pilot information.
     * @param date variable for flight's date.
     */
    public Flight(int flightNumber, String destination,
                    Pilot pilot, String date)
    {
        this.flightNumber = flightNumber;
        this.destination = destination;
        setPilot(pilot);
        this.date = date;
    }
    /**
     * accessor for flight number.
     * @return for flight number.
     */
    public int getFlightNumber()
    {
        return flightNumber;
    }
    /**
     * mutator for flight number.
     * @param flightNumber variable for flight number.
     */
    public void setFlightNumber(int flightNumber)
    {
        this.flightNumber = flightNumber;
    }
    /**
     * accessor for destination.
     * @return destination variable.
     */
    public String getDestination()
    {
        return destination;
    }
    /**
     * mutator for destination.
     * @param destination variable for flight destination.
     */
    public void setDestination(String destination)
    {
        this.destination = destination;
    }
    /**
     * accessor for date.
     * @return date return's date variable.
     */
    public String getDate()
    {
        return date;
    }
    /**
     * mutator for date.
     * @param date variable for flight's date.
     */
    public void setDate(String date)
    {
        this.date = date;
    }
    /**
     * accessor for pilot.
     * @return pilot returns pilot information.
     */
    public Pilot getPilot()
    {
        Pilot alpha = new Pilot();
        alpha.setName(pilot.getName());
        alpha.setLicense(pilot.getLicense());
        
        return alpha;
    }
    /**
     * mutator for Pilot name.
     * @param pilot variable for pilot object.
     */
    public void setPilot(Pilot pilot)
    {   
        Pilot p = new Pilot();
        p.setName(pilot.getName());
        p.setLicense(pilot.getLicense());
        this.pilot = p;
    }
    /**
     * toString no clue.
     * @return string returns string variable.
     */
    public String toString()
    {
        String flight1 = String.format("Flt#: " + flightNumber 
                + "\tDest: " + destination + "\tPlt: " 
                + pilot.getName() + "\tDate: " + date);
        
        return flight1;
    }
    /**
     * Deep copy for flight object.
     * @return copyOfThis to return flight object.
     */
    public Flight copy()
    {
        Flight copyOfThis = new Flight();
        copyOfThis.setFlightNumber(flightNumber);
        copyOfThis.setDestination(destination);
        copyOfThis.setDate(this.date);
        copyOfThis.setPilot(this.getPilot());

        return copyOfThis;
    }
}   

