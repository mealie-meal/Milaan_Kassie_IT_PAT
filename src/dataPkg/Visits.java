
package dataPkg;

import java.util.Date;


public class Visits
{
    private int visitNo;
    private String eventID;
    private String PatronID;
    private double amountSpent;
    private String username;
    private Date dateOfVisit;

    //DEF CONSTRUCOTR
    public Visits()
    {
    }
    
    //PARAMETERISED CONSTRUCTOR
    public Visits(int visitNo, String eventID, String PatronID, double amountSpent, String username, Date dateOfVisit)
    {
        this.visitNo = visitNo;
        this.eventID = eventID;
        this.PatronID = PatronID;
        this.amountSpent = amountSpent;
        this.username = username;
        this.dateOfVisit = dateOfVisit;
    }
    
    //SETTERS
    public void setVisitNo(int visitNo)
    {
        this.visitNo = visitNo;
    }

    public void setEventID(String eventID)
    {
        this.eventID = eventID;
    }

    public void setPatronID(String PatronID)
    {
        this.PatronID = PatronID;
    }

    public void setAmountSpent(double amountSpent)
    {
        this.amountSpent = amountSpent;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setDateOfVisit(Date dateOfVisit)
    {
        this.dateOfVisit = dateOfVisit;
    }
    
    //GETTERS
    public int getVisitNo()
    {
        return visitNo;
    }

    public String getEventID()
    {
        return eventID;
    }

    public String getPatronID()
    {
        return PatronID;
    }

    public double getAmountSpent()
    {
        return amountSpent;
    }

    public String getUsername()
    {
        return username;
    }

    public Date getDateOfVisit()
    {
        return dateOfVisit;
    }
    
    //TOSTRING
    @Override
    public String toString()
    {
        return "Visits{" + "visitNo=" + visitNo + ", eventID=" + eventID + ", PatronID=" + PatronID + ", amountSpent=" + amountSpent + ", username=" + username + ", dateOfVisit=" + dateOfVisit + '}';
    }

    
    
    
    
}
