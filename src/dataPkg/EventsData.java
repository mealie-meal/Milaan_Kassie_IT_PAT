package dataPkg;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EventsData
{

    private DbManager db;                                                       //this is the object of DbManager. //this is just declaring this object
    public List<Events> eventsList = new ArrayList();                           //if two tables then we connect using the foreign key and the main key
    EventsData ev;

    public EventsData() throws SQLException
    {
        db = new DbManager();                                                   //instantiating the object

        //ev = new EventsData();
        getAllEvents();                                                         //im calling without parameters because im calling the default constructor. 
    }

    public void getAllEvents() throws SQLException
    {
        getEventsList("SELECT * FROM TBLEVENTS");                            //this sql just gets all of the events. We call this when we press rbAll in the frame itself
    }

    public void getAllEventsEventID(String eventID) throws SQLException         //for rbEventID. //we're searching for an Event and all its details by entering its EventID
    {
        getEventsList("SELECT * FROM TBLEVENTS WHERE EVENTID = '" + eventID + "'");
    }

    public void getAllEventsEventName(String eventName) throws SQLException     //same as last method but using rbEventName now
    {
        getEventsList("SELECT * FROM TBLEVENTS WHERE EVENTNAME LIKE '" + eventName + "'");
    }

    public void getAllEventsLocation(String location) throws SQLException       //same as last method but using locaiton. //for rbLocation
    {
        getEventsList("SELECT * FROM TBLEVENTS WHERE LOCATION LIKE '" + location + "'");
    }
    
    public void getAllEventsStatus(String status) throws SQLException           //same as last method but using locaiton. //for rbLocation
    {
        getEventsList("SELECT * FROM TBLEVENTS WHERE STATUS LIKE '"+status+"'");
    }

    public void getEventsList(String sql) throws SQLException                   //the method that puts all the data from the table(TblEvents) into the list. 
    {
        ResultSet rs = db.query(sql);
        eventsList.clear();
        while (rs.next())
        {
            Events e = new Events();
            e.setEventID(rs.getString("EventID"));                  //text in orange is the name of the fields in the db spelt exactly the same so we can call from there
            e.setEventName(rs.getString("EventName"));
            e.setStartDate(rs.getDate("StartDate"));
            e.setEndDate(rs.getDate("EndDate"));
            e.setLocation(rs.getString("Location"));
            e.setCapacity(rs.getInt("Capacity"));
            e.setStatus(rs.getString("Status"));
            e.setRegistrationDeadline(rs.getDate("RegistrationDeadline"));
            eventsList.add(e);                                                  //actually putting it into the list
        }
    }

    //finding an event using the eventID to search for it
    public Events getEvent(String eventID) 
    {
        Events ev = new Events();

        boolean found = false;
        int counter = 0;
        while (found == false && counter < eventsList.size())
        {
            ev = eventsList.get(counter);
            if (ev.getEventID().equalsIgnoreCase(eventID))
            {
                found = true;
            }
            counter++;
        }
        return ev;
    }

    //we use this method in the populateJTable method for the second paremeter. the int rowSelect part
    public int getEventPosition(String eventID) 
    {
        int position = -1;
        Events e = new Events();

        boolean found = false;
        int counter = 0;
        while (found == false && counter < eventsList.size())
        {
            e = eventsList.get(counter);
            if (e.getEventID().equalsIgnoreCase(eventID))
            {
                found = true;
                position = counter;
            }
            counter++;
        }
        return position;
    }

    //The sql method to add an event. We call this for btnSaveNew in the frame
    public void addEvent(String eventID, String eventName, String startDate, String endDate, String location, int capacity, String status, String registrationDeadline) throws SQLException
    {
        if (db.update("INSERT INTO TBLEVENTS(EVENTID, EVENTNAME, STARTDATE, ENDDATE, LOCATION, CAPACITY, STATUS, REGISTRATIONDEADLINE) VALUES('" + eventID + "', '" + eventName + "', #" + startDate + "#, #" + endDate + "#, '" + location + "', " + capacity + ", '" + status + "', #" + registrationDeadline + "#)") > 0)
        {
            getAllEvents();
            JOptionPane.showMessageDialog(null, "Event successfully added to database", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Event NOT added to database", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    //same as last sql method but this is for btnSaveEdit. for when we edit data 
    public void editEvent(String eventID, String eventName, String startDate, String endDate, String location, int capacity, String status, String registrationDeadline) throws SQLException
    {
        if (db.update("UPDATE TBLEVENTS SET EVENTNAME = '" + eventName + "', STARTDATE = #" + startDate + "#, ENDDATE = #" + endDate + "#, LOCATION = '" + location + "',CAPACITY = " + capacity + ", STATUS = '" + status + "', REGISTRATIONDEADLINE = #" + registrationDeadline + "# WHERE EVENTID = '" + eventID +"'") > 0)
        {
            getAllEvents();
            JOptionPane.showMessageDialog(null, "Event successfully edited", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Event NOT edited", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        //we used sout tab to test the formatting of the data and see why it didnt work properly. It works fine now tho
        //System.out.println( eventID + "\t" + eventName + "\t" + startDate + "\t" + endDate + "\t" + location + "\t" + capacity + "\t" + status + "\t" +registrationDeadline); //Test output line
    }

    //for btnDelete. checking for an eventID and deleting that event with all its data
    public void deleteEvent(String eventID) throws SQLException
    {
        if (db.update("DELETE * FROM TBLEVENTS WHERE EVENTID = '" + eventID + "'") > 0)
        {
            getAllEvents();
            JOptionPane.showMessageDialog(null, "Event successfully deleted", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
        } else
        {
            JOptionPane.showMessageDialog(null, "Event NOT deleted", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    //sets the options for the location combo box
    public void populateLocationJComboBox(javax.swing.JComboBox locationCombo)  //Populate JComboBox populates the Jcombo box. if you didnt know that
    {
        locationCombo.removeAllItems();                                         //clearing out the cmb

        locationCombo.addItem("Online");                                    //adding options to the oombo box
        locationCombo.addItem("Physical Venue");
    }

    //sets the options for the status combo box
    public void populateStatusJComboBox(javax.swing.JComboBox statusCombo)      //Populate JComboBox populates the Jcombo box. 
    {
        statusCombo.removeAllItems();                                           //same as last populateCmb method

        statusCombo.addItem("Scheduled");
        statusCombo.addItem("Cancelled");
    }

    //populates the Jtable
    public void populateJTable(javax.swing.JTable table, int rowSelect)
    {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        model.setRowCount(0);

        for (int i = 0; i < eventsList.size(); i++)
        {
            dataPkg.Events e = eventsList.get(i);
            Object[] rowData =
            {
                e.getEventID(), e.getEventName(), e.getStartDate(), e.getEndDate(), e.getLocation(), e.getCapacity(), e.getStatus(), e.getRegistrationDeadline()
            };
            model.addRow(rowData);
        }

        table.setModel(model);

        if (table.getRowCount() > 0)
        {
            table.setRowSelectionInterval(rowSelect, rowSelect);
        }
    }

} //done commenting
