package dataPkg;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PatronsData
{

    private DbManager db;
    EventsData evd;                                                             //object of the EventsData class because we're linking there

    List<Patrons> patronsList = new ArrayList();                                //this is defining a list
    //inside the <> it said users because we are storing patrons info

    public PatronsData() throws SQLException
    {
        db = new DbManager();
        evd = new EventsData();

        getAllPatrons();
    }

    public void getAllPatrons() throws SQLException                             //each method here is for calling with different parameters. these will be used for the Radio Buttons in the frames
    {                                               
        getPatronList("SELECT * FROM TBLPATRONS");
    }

    public void getAllPatronsPatronID(String patronID) throws SQLException      //searching for patrons by their PatronID(primary key) //now we can just call with diff paras and get results (sql)
    {
        getPatronList("SELECT * FROM TBLPATRONS WHERE PATRONID = '" + patronID + "'");
    }

    public void getAllPatronsFirstName(String firstName) throws SQLException                                                                 
    {
        getPatronList("SELECT * FROM TBLPATRONS WHERE FIRSTNAME = '" + firstName + "'"); //checking what department they is in
    }
    
    public void getAllPatronsCardLevel(String cardLevel) throws SQLException                                                                 
    {
        getPatronList("SELECT * FROM TBLPATRONS WHERE CARDLEVEL = '" + cardLevel + "'"); //checking what department they is in
    }
    
    public void getAllPatronsGender(String gender) throws SQLException                                                                 
    {
        getPatronList("SELECT * FROM TBLPATRONS WHERE GENDER = '" + gender + "'"); //checking what department they is in
    }
     
    public void getPatronList(String sql) throws SQLException                   //now populating the list with values
    {                                                                           //this gonna be in all data classes because it reads data and puts it from the table into the list
        ResultSet rs = db.query(sql);                                        //this method is versatile because no sql is harcoded, we jsut uses a string variable called "sql"
        patronsList.clear();                                                    //change the userList -like visitList for a visits table- for whatever you using, COPY, PASTE, EDIT
        while (rs.next())
        {
            Patrons p = new Patrons();                                          //this will also change depending on the data class. Users will change

            p.setPatronID(rs.getString("PatronID"));               //same as previous class. 
            p.setFirstName(rs.getString("FirstName"));
            p.setSurname(rs.getString("Surname"));
            p.setGender(rs.getString("Gender"));
            p.setDateOfBirth(rs.getDate("DateOfBirth"));
            p.setHomeAddress(rs.getString("HomeAddress"));
            p.setEmailAddress(rs.getString("EmailAddress"));
            p.setCardLevel(rs.getString("CardLevel"));
            p.setJoinDate(rs.getDate("JoinDate"));

            patronsList.add(p);
        }
    }

    public Patrons getPatron(String patronID)                                   //searching by patronID, //this will be used to check if the patron already exists when creating a new record
    {
        Patrons p = new Patrons();                                              //making on object of the patrons class

        boolean found = false;
        int counter = 0;
        while (found == false && counter < patronsList.size())
        {
            p = patronsList.get(counter);
            if (p.getPatronID().equalsIgnoreCase(patronID)) 
            {
                found = true;
            }
            counter++;
        }
        return p;                                                               // if we go to the end and nothing was found. we return an empty object. Data needs to be checked for editing and adding. //also use autonnumber for Primary key. 
    }

    public int getPatronPosition(String patronID)                               //we using this for the populateJTable method when we we're in the save new and save edit buttons, for second parameter, int rowsSelect
    {
        int position = -1;
        Patrons p = new Patrons();

        boolean found = false;
        int counter = 0;
        while (found == false && counter < patronsList.size())
        {
            p = patronsList.get(counter);
            if (p.getPatronID().equalsIgnoreCase(patronID))
            {
                found = true;
                position = counter;
            }
            counter++;
        }
        return position;
    }

    //the adding sql. adds to the PatronID
    public void addPatron(String patronID, String firstName, String surname, String gender, String dateOfBirth, String homeAddress, String emailAddress, String cardLevel, String joinDate) throws SQLException //if we get errors here a little later check punctuation and all that in the field insertion section. i might have mesed that up. i porbably didnt tho. but still, just check
    {
        if (db.update("INSERT INTO TBLPATRONS(PATRONID, FIRSTNAME, SURNAME, GENDER, DATEOFBIRTH, HOMEADDRESS, EMAILADDRESS, CARDLEVEL, JOINDATE) VALUES('" + patronID + "','" + firstName + "','" + surname + "', '" + gender + "',  #" + dateOfBirth + "#, '" + homeAddress + "', '" + emailAddress + "' ,'" + cardLevel + "', #" + joinDate + "#)") > 0)
        {
            getAllPatrons();
            JOptionPane.showMessageDialog(null, "Patron successfully added to database", "INFORMATION", JOptionPane.INFORMATION_MESSAGE); //successfully added
        } else
        {
            JOptionPane.showMessageDialog(null, "Patron NOT added to database", "ERROR", JOptionPane.ERROR_MESSAGE); //not successfully added :( 
        }    //all the SQL is in the data class and the frame connects to the data class
    }

    //editing sql, adding to tblPatrons
    public void editPatron(String patronID, String firstName, String surname, String gender, String dateOfBirth, String homeAddress, String emailAddress, String cardLevel, String joinDate) throws SQLException //used to be editUser
    {
        if (db.update("UPDATE TBLPATRONS SET PATRONID = '" + patronID + "', FIRSTNAME = '" + firstName + "', SURNAME = '" + surname + "', GENDER = '" + gender + "', DATEOFBIRTH = #" + dateOfBirth + "#, HOMEADDRESS = '" + homeAddress + "', EMAILADDRESS = '" + emailAddress + "', CARDLEVEL = '" + cardLevel + "', JOINDATE = #" + joinDate + "# WHERE PATRONID = '" + patronID + "'") > 0) //we look for an employees name and change everythin based on that
        {                                                                                                                                    //puntuation is weird here. may not work
            getAllPatrons();
            JOptionPane.showMessageDialog(null, "Patron successfully edited", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Patron NOT edited", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    //deleteing from TblPatrons
    public void deletePatron(String patronID) throws SQLException
    {
        if (db.update("DELETE * FROM TBLPATRONS WHERE PATRONID = '" + patronID + "'") > 0)
        {
            getAllPatrons();
            JOptionPane.showMessageDialog(null, "Patron successfully deleted", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Patron NOT deleted", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    //sets the options for the card level combo
    public void populateJComboBoxCardLevel(javax.swing.JComboBox patronCombo)   //Populate JComboBox populates the Jcombo box. if you didnt know that
    {
        
        patronCombo.removeAllItems();
        
        patronCombo.addItem("Silver");
        patronCombo.addItem("Gold");
        patronCombo.addItem("Black");
        patronCombo.addItem("Platinum");
    }

    //puts the options for the Gender combo box
    public void populateJComboBoxGender(javax.swing.JComboBox patronCombo)      //Populate JComboBox populates the Jcombo box. if you didnt know that
    {
        patronCombo.removeAllItems();
        
        patronCombo.addItem("Female");
        patronCombo.addItem("Male");
        patronCombo.addItem("Other");
    }

    //populates the JTable
    public void populateJTable(javax.swing.JTable table, int rowSelect)         //in this parameter we're getting a whoe table, javax.swing.JTable
    { //everytime you change the view of the table you have to call populateJTable(). 
        DefaultTableModel model = (DefaultTableModel) table.getModel(); 

        model.setRowCount(0); //clears the table

        for (int i = 0; i < patronsList.size(); i++)
        {
            dataPkg.Patrons p = patronsList.get(i); //fine
            Object[] rowData =
            {
                p.getPatronID(), p.getFirstName(), p.getSurname(), p.getGender(), p.getDateOfBirth(), p.getHomeAddress(), p.getEmailAddress(), p.getCardLevel(), p.getJoinDate()
            };
            model.addRow(rowData);
        }

        table.setModel(model);

        if (table.getRowCount() > 0)                                            //if there is something in the first row, then
        {
            table.setRowSelectionInterval(rowSelect, rowSelect);
        }

    }
} //done commenting
