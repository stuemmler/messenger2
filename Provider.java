
/**
 * Write a description of class Provider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Provider
{
    // instance variables - replace the example below with your own
    private String name;
    private Mobiltelefon mt1, mt2, mt3;
    
    /**
     * Constructor for objects of class Provider
     */
    public Provider(String pName)
    {
        this.name = pName;
        this.mt1 = null;
        this.mt2 = null;
        this.mt3 = null;
    }

    public void weiterleiten(SMS pSms)
    {
        if(mt1.getTelefonnummer() == pSms.getEmpfaenger())
        {
            mt1.empfangeSMS(pSms);
            return;
        }
        if(mt2.getTelefonnummer() == pSms.getEmpfaenger())
        {
            mt2.empfangeSMS(pSms);
            return;
        }
        if(mt2.getTelefonnummer() == pSms.getEmpfaenger())
        {
            mt2.empfangeSMS(pSms);
            return;
        }
        System.out.println("Empfänger unbekannt, SMS nicht gesendet.");
    }
    
    /** 
     * @param  pMt   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setMt1(Mobiltelefon pMt)
    {
       this.mt1 = pMt;
    }

    /** 
     * @param  pMt   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setMt2(Mobiltelefon pMt)
    {
        this.mt2 = pMt;
    }

    /** 
     * @param  pMt   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setMt3(Mobiltelefon pMt)
    {
        this.mt3 = pMt;
    }
    
    public void mtAnmelden(Mobiltelefon pMt)
    {
        if (mt1 == null)
        {
            this.setMt1(pMt);
            return;
        }
        if (mt2 == null)
        {
            this.setMt2(pMt);
            return;
        }
        if (mt3 == null)
        {
            this.setMt3(pMt);
            return;
        }
        System.out.println("Alle Plätze derzeit belegt. Gerät konnte nicht angemeldet werden.");
    }
    
    public void mtAbmelden(Mobiltelefon pMt)
    {
        if(mt1 != null && this.mt1.equals(pMt))
        {
            this.mt1 = null;
            return;
        }
        if(mt2 != null && this.mt2.equals(pMt))
        {
            this.mt2 = null;
            return;
        }
        if(mt1 != null && this.mt3.equals(pMt))
        {
            this.mt3 = null;
            return;
        }
        System.out.println("Mobiltelefon nicht gefunden. Gerät konnte nicht abgemeldet werden.");
    }
}
