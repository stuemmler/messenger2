
/**
 * Write a description of class SMS here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SMS
{
    private double absender;
    private String inhalt;
    private double empfaenger;
    /**
     * Constructor for objects of class SMS
     */
    public SMS(double pAbsender, String pInhalt, double pEmpfaenger)
    {
        this.absender = pAbsender;
        this.inhalt = pInhalt;
        this.empfaenger = pEmpfaenger;
    }

    public double getAbsender()
    {
        return this.absender;
    }
    
    public String getInhalt()
    {
        return this.inhalt;
    }
    
    public double getEmpfaenger()
    {
        return this.empfaenger;
    }
}
