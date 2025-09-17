package dataPkg;

import java.util.Date;

public class Patrons
{

    //making all vars
    String patronID;
    String firstName;
    String surname;
    String gender;
    Date dateOfBirth;
    String homeAddress;
    String emailAddress;
    String cardLevel;
    Date joinDate;

    //DEF CONSTRUCTOR
    public Patrons()
    {
    }

    //PARMETERISED CONSTRUCTOR 
    public Patrons(String patronID, String firstName, String surname, String gender, Date dateOfBirth, String homeAddress, String emailAddress, String cardLevel, Date joinDate)
    {
        this.patronID = patronID;
        this.firstName = firstName;
        this.surname = surname;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.homeAddress = homeAddress;
        this.emailAddress = emailAddress;
        this.cardLevel = cardLevel;
        this.joinDate = joinDate;
    }

    //SETTERS

    public void setPatronID(String patronID)
    {
        this.patronID = patronID;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public void setDateOfBirth(Date dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public void setHomeAddress(String homeAddress)
    {
        this.homeAddress = homeAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public void setCardLevel(String cardLevel)
    {
        this.cardLevel = cardLevel;
    }

    public void setJoinDate(Date joinDate)
    {
        this.joinDate = joinDate;
    }
    
    //GETTERS

    public String getPatronID()
    {
        return patronID;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getSurname()
    {
        return surname;
    }

    public String getGender()
    {
        return gender;
    }

    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    public String getHomeAddress()
    {
        return homeAddress;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public String getCardLevel()
    {
        return cardLevel;
    }

    public Date getJoinDate()
    {
        return joinDate;
    }
}
