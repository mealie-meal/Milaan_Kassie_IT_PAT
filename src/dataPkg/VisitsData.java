package dataPkg;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VisitsData
{

    private DbManager db;
    EventsData ed; //useTypeData is EventsData for me 
    PatronsData pd;
    UsersData ud;

    private List<Visits> visitsList = new ArrayList();                          //this is defining a list
    //inside the <> it says visits because we are storing visits info

    public VisitsData() throws SQLException
    {
        db = new DbManager();
        
        ed = new EventsData();                                                  //making objects of each class to pull for the JComboBox methodsS
        pd = new PatronsData();
        ud = new UsersData();

        getAllVisits();
    }

    public void getAllVisits() throws SQLException                              //each method uses diff paras to search for
    {                                             
        getVisitsList("SELECT * FROM TBLVISITS");
    }

    public void getAllVisitsVisitNo(int visitNo) throws SQLException
    {
        getVisitsList("SELECT * FROM TBLVISITS WHERE VISITNO = " + visitNo);
    }
    
    public void getAllVisitsPatronID(String patronID) throws SQLException
    {
        getVisitsList("SELECT * FROM TBLVISITS WHERE PATRONID = '" + patronID + "'");
    }
    
    public void getAllVisitsEventID(String eventID) throws SQLException
    {
        getVisitsList("SELECT * FROM TBLVISITS WHERE EVENTID = '"+eventID+"'");
    }
    
    public void getAllVisitsUsername(String username) throws SQLException
    {
        getVisitsList("SELECT * FROM TBLVISITS WHERE USERNAME = '"+username+"'");
    }

    //populating the list
    public void getVisitsList(String sql) throws SQLException                   //now populating the list with values
    {                                                                           //this gonna be in all data classes because it reads data and puts it from the table into the list
        ResultSet rs = db.query(sql);                                           //this method is versatile because no sql is harcoded, we jsut uses a string variable called "sql"
        visitsList.clear();                                                    
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        while (rs.next())
        {
            Visits v = new Visits();                                            //this will also change depending on the data class. Users will change
            v.setVisitNo(rs.getInt("VisitNo"));                                 //this orange text is the EXACT field names of the tables. make sure they the same 
            v.setPatronID(rs.getString("PatronID"));                            //making an object here, which will then be added into the list
            v.setEventID(rs.getString("EventID"));                              //if there was seven field then we have 7 of these lines. then add with the last line
            v.setAmountSpent(rs.getDouble("AmountSpent"));
            v.setUsername(rs.getString("Username"));
            //v.setDateOfVisit(new SimpleDateFormat("yyyy-MM-dd").format(rs.getString("DateOfVisit")));
            v.setDateOfVisit(rs.getDate("DateOfVisit"));
            visitsList.add(v);
        }
    }

    public Visits getVisit(String PatronID) //getting a visit based on patronID
    {
        Visits v = new Visits(); //this calls the parameterised construcotr. //in the while loop we are saying get the onject from this position and check wether theyre matching. IF found == true then we stop searching

        boolean found = false;
        int counter = 0;
        while (found == false && counter < visitsList.size())
        {
            v = visitsList.get(counter);
            if (v.getPatronID().equalsIgnoreCase(PatronID))
            {
                found = true;
            }
            counter++;
        }
        return v;  //also use autonnumber for Primary key. 
    }

    public int getVisitPosition(int visitNo) //this method will be referenced in the saveNew and saveEdit buttons in the VisitsTable Frame. for the parameter of the populateJTable method
    {
        int position = -1;
        Visits v  = new Visits();

        boolean found = false;
        int counter = 0;
        while (found == false && counter < visitsList.size())
        {
            v = visitsList.get(counter);
            if (v.getVisitNo() == visitNo)
            {
                found = true;
                position = counter;
            }
            counter++;
        }
        return position;
    }
    
//    public int getVisitPosition(String patronID, String eventID, double amountSpent, String username, Date dateOfVisit) //this method will be referenced in the saveNew and saveEdit buttons in the VisitsTable Frame. for the parameter of the populateJTable method
//    {
//        int position = -1;
//        Visits v  = new Visits();
//
//        boolean found = false;
//        int counter = 0;
//        while (found == false && counter < visitsList.size())
//        {
//            v = visitsList.get(counter);
//            if (v.getEventID().equalsIgnoreCase(eventID) && v.getPatronID().equalsIgnoreCase(patronID) && v.getUsername().equalsIgnoreCase(username) && v.getDateOfVisit().equals(dateOfVisit))
//            {
//                found = true;
//                position = counter;
//            }
//            counter++;
//        }
//        return position;
//    }
    
    //    public void addVisit(int visitNo, String eventID, String patronID, double amountSpent, String username, String dateOfVisit) throws SQLException
//    {
//        if (db.update("INSERT INTO TBLVISITS(VISITNO, EVENTID, PATRONID, AMOUNTSPENT, USERNAME, DATEOFVISIT) VALUES(" + visitNo + ",'" + eventID + "','" + patronID + "', " + amountSpent + ", '" + username + "', #"+dateOfVisit+"#)") > 0)
//        {
//            getAllVisits();
//            JOptionPane.showMessageDialog(null, "Visit successfully added to database", "INFORMATION", JOptionPane.INFORMATION_MESSAGE); //successfully added
//        } else
//        {
//            JOptionPane.showMessageDialog(null, "Visit NOT added to database", "ERROR", JOptionPane.ERROR_MESSAGE); //not successfully added :(
//        }    //all the SQL is in the data class and the frame connects to the data class
//        System.out.println("" + visitNo + "\t" + eventID + "\t" + patronID + "\t" + amountSpent + "\t" + dateOfVisit);
//    }
    
    //adding method to add to the table. for the saveNew button
//    public void addVisit(int newVisitNo,String eventID, String patronID, double amountSpent, String username, String dateOfVisit) throws SQLException
//    {
//        if (db.update("INSERT INTO TBLVISITS(VISITNO, EVENTID, PATRONID, AMOUNTSPENT, USERNAME, DATEOFVISIT) SELECT Nz(Max(VISITNO), 0) + 1, '"+eventID+"', '"+patronID+"', "+amountSpent+", '"+username+"', #"+dateOfVisit+"# FROM TBLVISITS") > 0)
//        {
//            getAllVisits();
//            JOptionPane.showMessageDialog(null, "Visit successfully added to database", "INFORMATION", JOptionPane.INFORMATION_MESSAGE); //successfully added
//        } else
//        {
//            JOptionPane.showMessageDialog(null, "Visit NOT added to database", "ERROR", JOptionPane.ERROR_MESSAGE); //not successfully added :(
//        }    //all the SQL is in the data class and the frame connects to the data class
//        System.out.println(eventID + "\t" + patronID + "\t" + amountSpent + "\t" + dateOfVisit);
//    }
    
    public void addVisit(int visitNo,String eventID, String patronID, double amountSpent, String username, String dateOfVisit) throws SQLException
    {
        if (db.update("INSERT INTO TBLVISITS(VISITNO, EVENTID, PATRONID, AMOUNTSPENT, USERNAME, DATEOFVISIT) VALUES("+visitNo+", '"+eventID+"', '"+patronID+"', "+amountSpent+", '"+username+"', #"+dateOfVisit+"#)") > 0)
        {
            getAllVisits();
            JOptionPane.showMessageDialog(null, "Visit successfully added to database", "INFORMATION", JOptionPane.INFORMATION_MESSAGE); //successfully added
        } else
        {
            JOptionPane.showMessageDialog(null, "Visit NOT added to database", "ERROR", JOptionPane.ERROR_MESSAGE); //not successfully added :(
        }    //all the SQL is in the data class and the frame connects to the data class
        System.out.println(eventID + "\t" + patronID + "\t" + amountSpent + "\t" + dateOfVisit);
    }
    


    //editing methods for the saveEdit button
    public void editVisit(int visitNo, String eventID, String patronID, double amountSpent, String username, String dateOfVisit) throws SQLException
    {
        if (db.update("UPDATE TBLVISITS SET EVENTID = '" + eventID + "', PATRONID = '" + patronID + "',AMOUNTSPENT = " + amountSpent + ", USERNAME = '" + username + "', DATEOFVISIT = #"+dateOfVisit+"#  WHERE VISITNO = " + visitNo + "") > 0)
        {
            getAllVisits();
            JOptionPane.showMessageDialog(null, "Visit successfully edited", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Visit NOT edited", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    //to deleter visits
    public void deleteVisit(int visitNo) throws SQLException //DONE
    {
        if (db.update("DELETE * FROM TBLVISITS WHERE VISITNO = " + visitNo + "") > 0) 
        {
            getAllVisits();
            JOptionPane.showMessageDialog(null, "Visit successfully deleted", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Visit NOT deleted", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void populateVisitNoJComboBox(javax.swing.JComboBox visitNoCombo) 
    {
        visitNoCombo.removeAllItems();
        for (int i = 0; i < visitsList.size(); i++)
        {
            dataPkg.Visits v = visitsList.get(i);                                         
            visitNoCombo.addItem(v.getVisitNo());
        }
    }
    
    //populates the eventID combo box
    public void populateEventIDJComboBox(javax.swing.JComboBox eventIDCombo) 
    {
        eventIDCombo.removeAllItems();
        for (int i = 0; i < ed.eventsList.size(); i++)
        {
            dataPkg.Events e = ed.eventsList.get(i);                                         
            eventIDCombo.addItem(e.getEventID());
        }
    }
    
    //populates the patronID combo box
    public void populatePatronIDJComboBox(javax.swing.JComboBox patronIDCombo) //ALL B$ THIS ONE ARE DONE
    {
        patronIDCombo.removeAllItems();
        for (int i = 0; i < pd.patronsList.size(); i++)
        {
            dataPkg.Patrons p = pd.patronsList.get(i);                                          //THIS IS WHERE IT IS MADE
            patronIDCombo.addItem(p.getPatronID());
        }

    }
    
    //populates the username combo box
    public void populateUsernameJComboBox(javax.swing.JComboBox usernameCombo) //ALL B$ THIS ONE ARE DONE
    {
        usernameCombo.removeAllItems();
        for (int i = 0; i < ud.userList.size(); i++)
        {
            dataPkg.Users u = ud.userList.get(i);                                          //THIS IS WHERE IT IS MADE
            usernameCombo.addItem(u.getUsername());
        }
    }
    
    //populates the JTable method
    public void populateJTable(javax.swing.JTable table, int rowSelect)
    {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        model.setRowCount(0);

        for (int i = 0; i < visitsList.size(); i++)
        {
            dataPkg.Visits v = visitsList.get(i);
            Object[] rowData =
            {
                v.getVisitNo(), v.getEventID(), v.getPatronID(), v.getAmountSpent(), v.getUsername(), v.getDateOfVisit()
            };
            model.addRow(rowData);
        }

        table.setModel(model);

        if (table.getRowCount() > 0)
        {
            table.setRowSelectionInterval(rowSelect, rowSelect);
        }
    }    
}