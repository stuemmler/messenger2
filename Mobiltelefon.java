
/**
 * Write a description of class Mobiltelefon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mobiltelefon
{
    private double telefonnummer;
    private boolean an;
    private String modellnummer;
    private int pin;
    private Provider provider;
    /**
     * Constructor for objects of class Mobiltelefon
     */
    public Mobiltelefon(double pTelefonnummer, String pModellnummer, int pPin)
    {
        this.telefonnummer = pTelefonnummer;
        this.modellnummer = pModellnummer;
        this.pin = pPin;
    }

    /**
     * Ist die übergebene PIN mit der PIN des Mobiltelefons identisch, wird das Mobiltelefon beim Provider angemeldet und die
     * @param  pPin die beim Einschalten eingegebene PIN 
     */
    public void einschalten(int pPin, Provider pProvider)
    {
        if(an)
        {
            System.out.println("Mobiltelefon ist bereits angeschaltet.");
            return;
        }
        
        if (pPin == this.pin)
        {
            this.setProvider(pProvider);
            provider.mtAnmelden(this);
            an = true;
        }
        else
        {
            System.out.println("Falsche PIN. Mobiltelefon konnte nicht angemeldet werden.");
        }
    }

    /**
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void ausschalten()
    {
        if(!an)
        {
            System.out.println("Mobiltelefon ist bereits ausgeschaltet.");
            return;
        }
        
        provider.mtAbmelden(this);
        an = false;
    }

    /**
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void sendeSMS(String pInhalt, double pEmpfaenger)
    {
        this.provider.weiterleiten(new SMS(this.telefonnummer, pInhalt, pEmpfaenger));
    }

    /**
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    protected void empfangeSMS(SMS pSms)
    {
        System.out.println("Neue SMS von: " + pSms.getAbsender());
        System.out.println(pSms.getInhalt());
    }

    /**
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double getTelefonnummer()
    {
        return this.telefonnummer;
    }

    /**
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getModellnummer()
    {
        return this.modellnummer;
    }

    /**
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setProvider(Provider pProvider)
    {
        this.provider = pProvider;
    }

    /**
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setPin(int pPin, int newPin)
    {
        if (this.pin == pPin)
        {
            this.pin = newPin;
        }
        else
        {
            System.out.println("Falsche PIN");
        }
    }
}