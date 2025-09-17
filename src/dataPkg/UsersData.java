
package dataPkg;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class UsersData
{
    private DbManager db;

    List <Users> userList = new ArrayList(); //this is defining a list
    

    public UsersData() throws SQLException
    {
        db = new DbManager();

        getAllUsers();
    }
    
    public void getAllUsers() throws SQLException 
    {                                             
        getUsersList("SELECT * FROM TBLUSERS ORDER BY USERNAME"); //these methods are called in the Radio Buttons to search for records using the corresponding parameters such as username 
    }

    public void getAllUsers(String username) throws SQLException
    {
        getUsersList("SELECT * FROM TBLUSERS WHERE USERNAME LIKE '%" + username + "%'");
    }

    public void getAllUsers(int userLevel) throws SQLException
    {
        getUsersList("SELECT * FROM TBLUSERS WHERE USERLEVEL = " + userLevel);
    }
    
    //can make this the first method of any data class. //DONE
    public void getUsersList(String sql) throws SQLException //now populating the list with values
    {                                                        //this gonna be in all data classes because it reads data and puts it from the table into the list
        ResultSet rs = db.query(sql);                        //this method is versatile because no sql is harcoded, we jsut uses a string variable called "sql"
        userList.clear(); //change the userList -like StockList for a stock table- for whatever you using, COPY, PASTE, EDIT
        while (rs.next())
        {
            Users u = new Users(); //this will also change depending on the data class. Users will change
            u.setUsername(rs.getString("USERNAME")); //this orange text is the EXACT field names of the tables. make sure they the same 
            u.setPassword(rs.getString("PASSWORD")); //making an object here, which will then be added into the list
            u.setFirstName(rs.getString("FIRSTNAME"));      //if there was seven field then we have 7 of these lines. then add with the last line
            u.setSurname(rs.getString("SURNAME"));
            userList.add(u); 
        }
    }
   
    public Users getUsername(String username) //DONE
    {
        Users u = new Users(); //this calls the parameterised construcotr. //in the while loop we are saying get the onject from this position and check wether theyre matching. IF found == true then we stop searching

        boolean found = false;
        int counter = 0;
        while (found == false && counter < userList.size())
        {
            u = userList.get(counter);
            if (u.getUsername().equalsIgnoreCase(username))
            {
                found = true;
            }
            counter++;
        }
        return u; // if we go to the end and nothing was found. we return an empty object. Data needs to be checked for editing and adding. //also use autonnumber for Primary key. //also u
    }
}
