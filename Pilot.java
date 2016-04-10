/**
 * Pilot class for Boone International project.
 * 
 * @author Dillingham, Jace
 * @version 4/1/16
 */
public class Pilot
{
    private String name;
    private String license;

    /**
     * Pilot constructor.
     * @param name variable for pilot name.
     * @param license variable for pilot license.
     */
    public Pilot(String name, String license)
    {
        setName(name);
        setLicense(license);
    }
    /**
     * Pilot object.
     */
    public Pilot()
    {
        setName("");
        setLicense("");
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
     * @param name variable for pilot name.
     */
    public void setName(String name)
    {
        if (name == null)
        {
            this.name = "";
        }
        else
        {
            this.name = name;
        }
    }

    /**
     * accessor for license number.
     * @return for license number.
     */
    public String getLicense()
    {
        return license;
    }

    /**
     * mutator for license number.
     * @param license variable for pilot license.
     */
    public void setLicense(String license)
    {
        if (license == null)
        {
            this.license = "";
        }
        else
        {
            this.license = license;
        }
    }

    /**
     * copy pilot information.
     * @return pilot information.
     */
    public Pilot copy()
    {
        Pilot copyPilot = new Pilot(name, license);
        return copyPilot;
    }

    /**
     * to string method.
     * @return to string.
     */
    public String toString()
    {
        String pilotString = "Name: " + name + " - License: " + license;
        return pilotString;
    }

    /**
     * compare pilot information.
     * @param pilot information.
     * @return boolean for pilot information.
     */
    public boolean equals(Pilot pilot)
    {
        String alpha = pilot.toString();
        String bravo = this.toString();

        return alpha.equals(bravo);
    }
}
