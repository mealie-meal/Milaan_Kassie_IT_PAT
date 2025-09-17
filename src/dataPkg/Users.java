
package dataPkg;


public class Users //THIS THE DAMN OBJECT CLASS. CAUSE IT HAS THE VARIABLESSS. HOW DO YOU NOT KNOW THIS OML
{
    private String username;
    private String password;
    private String firstName;
    private String surname;

    //DEF CONSTRUCTOR
    public Users()
    {
    }

    //PARAMETERISED CONSTRUCTOR
    public Users(String username, String password, String firstName, String surname)
    {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.surname = surname;
    }
    
    //GETTERS

    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getSurname()
    {
        return surname;
    }
    
    //SETTERS

    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    @Override
    public String toString()
    {
        return "Users{" + "username=" + username + ", password=" + password + ", firstName=" + firstName + ", surname=" + surname + '}';
    }
    
    
    
    
}
