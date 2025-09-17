
package dataPkg;

import java.util.Date;

public class Events
{
    //making vars
    private String eventID;
    private String eventName;
    private Date startDate;
    private Date endDate;
    private String location;
    private int capacity;
    private String status;
    private Date registrationDeadline;

    //DEF CONSTRUCTOR
    public Events()
    {
    }
    
    //PARAMETERISED CONSTRUCTOR
    public Events(String eventID, String eventName, Date startDate, Date endDate, String location, int capacity, String status, Date registrationDeadline)
    {
        this.eventID = eventID;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.capacity = capacity;
        this.status = status;
        this.registrationDeadline = registrationDeadline;
    }
   
   //SETTERS

    public void setEventID(String eventID)
    {
        this.eventID = eventID;
    }

    public void setEventName(String eventName)
    {
        this.eventName = eventName;
    }

    public void setStartDate(Date startDate)
    {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate)
    {
        this.endDate = endDate;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public void setRegistrationDeadline(Date registrationDeadline)
    {
        this.registrationDeadline = registrationDeadline;
    }
    
    //GETTERS

    public String getEventID()
    {
        return eventID;
    }

    public String getEventName()
    {
        return eventName;
    }

    public Date getStartDate()
    {
        return startDate;
    }

    public Date getEndDate()
    {
        return endDate;
    }

    public String getLocation()
    {
        return location;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public String getStatus()
    {
        return status;
    }

    public Date getRegistrationDeadline()
    {
        return registrationDeadline;
    }
    
    //TOSTRING METHOD

    @Override
    public String toString()
    {
        return "Events{" + "eventID=" + eventID + ", eventName=" + eventName + ", startDate=" + startDate + ", endDate=" + endDate + ", location=" + location + ", capacity=" + capacity + ", status=" + status + ", registrationDeadline=" + registrationDeadline + '}';
    }
    
    
    
    
    
    
}
