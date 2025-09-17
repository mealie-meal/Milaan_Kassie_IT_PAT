package dataPkg;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class ReportsData
{

    private DbManager db; //this is the object of DbManager. //this is just declaring this object

    public ReportsData() throws SQLException
    {
        db = new DbManager();

    }

    public void pieChart() throws SQLException
    {
        ResultSet rs = db.query("SELECT FIRSTNAME, COUNT(*) FROM TBLPATRONS GROUP BY FIRSTNAME");

        //one row overall. 
        //1st column is the name
        //2nd column has the count which is a number
        //for lists we dont need to specify the number of spaces. UNLIKE ARRAYs
        List<String> categoryLabels = new ArrayList(); //in sirs one this is harcoded. We're getting rw vals from db for this
        List<Integer> values = new ArrayList();

        while (rs.next())
        {
            //getting value for the first column and adds it to categoryLabels
            categoryLabels.add(rs.getString(1));
            //getting value for the second column and adds it to values
            values.add(rs.getInt(2)); //the number is the column name
        }

        //thing is the pie chart deals with Arrays and NOT LISTS
        //convert them then
        //this is making an array with the nunber of spaces equal to the number of elements in the list
//        String[] cl = new String[categoryLabels.size()]; //so now categoryLabels elements are in this array. Essentially converted to an array       
//        //now making the array cl into a version of 
//        categoryLabels.toArray(cl); 
//    
//        
//        Integer[] v = new Integer[values.size()];
//        values.toArray(v); //make sure its not int and Integer. Must be both Integer
        DefaultPieDataset data = new DefaultPieDataset();

        for (int i = 0; i < categoryLabels.size(); i++)
        {
            //we want an int from an integer object
            data.setValue(categoryLabels.get(i), (int) values.get(i));
        }

        JFreeChart pieChart = ChartFactory.createPieChart("Pie Chart Title", data, true, true, false);

        ChartFrame graphFrame = new ChartFrame("Window Title", pieChart);
        graphFrame.pack();
        graphFrame.setLocationRelativeTo(null);
        graphFrame.setVisible(true);

    }

    public void barGraph() throws SQLException
    {
        ResultSet rs = db.query("SELECT FIRSTNAME, COUNT(*) FROM TBLPATRONS GROUP BY FIRSTNAME");

        List<String> categoryLabels = new ArrayList(); //in sirs one this is harcoded. We're getting rw vals from db for this
        List<Integer> values = new ArrayList();

        while (rs.next())
        {
            //getting value for the first column and adds it to categoryLabels
            categoryLabels.add(rs.getString(1));
            //getting value for the second column and adds it to values
            values.add(rs.getInt(2)); //the number is the column name
        }

        DefaultCategoryDataset data = new DefaultCategoryDataset();

        for (int j = 0; j < categoryLabels.size(); j++)
        {
            data.addValue(values.get(j), "", categoryLabels.get(j));
        }
        JFreeChart barChart = ChartFactory.createBarChart("Bar Chart Title", "X axis Label", "Y axis Label", data, PlotOrientation.VERTICAL, true, true, false);

        ChartFrame graphFrame = new ChartFrame("Window Title", barChart);
        graphFrame.pack();
        graphFrame.setLocationRelativeTo(null);
        graphFrame.setVisible(true);

    }

    public String getHighestSpender() throws SQLException
    {
//        String output = "Highest Spender unknown\n\n";
//        String output = "%-20s%-20s%-20s%-20s%-20s%n";
        String output = "Highest Spender:\n\n";
        output += String.format("%-13s%-13s%-13s%-13s%n", "PatronID", "Name", "Surname", "Total Spent");

        //output += String.format("%-20s%-20s%-20s%-20s%-20s%-20sn"); //the s stands for String, change it for data types. //this is for headings
        output += "\n";

        ResultSet rs = db.query("SELECT TOP 1 TBLVISITS.PATRONID, TBLPATRONS.FIRSTNAME, TBLPATRONS.SURNAME, Sum(TBLVISITS.AMOUNTSPENT) AS [Grand Total] FROM TBLVISITS, TBLPATRONS WHERE TBLVISITS.PATRONID = TBLPATRONS.PATRONID GROUP BY TBLVISITS.PATRONID, TBLPATRONS.FIRSTNAME, TBLPATRONS.SURNAME ORDER BY 4 DESC");
        //ResultSet rs = db.query("whatever the sql is")
        while (rs.next()) //while because the query may have multiple lines to it
        {
            //output += rs.getString(1) + "\t";                  //because the first thing, VIsitNo is an int
            output += String.format("%-13s%-13s%-13s%-13s%n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            output += "\n\n";
        }
        return output;
    }

    public String getMostVisitsPatron() throws SQLException
    {

//        String output = "Patron with the most visits:\n\n"+"PatronID\t" + "Name\t" + "Surname\t" + "Number of Visits\n";
//
//        output += "\n\n";
        String output = "Patron with the most visits\n\n";
        output += String.format("%-13s%-13s%-13s%-13s", "PatronID", "Name", "Surname", "Number of Visits\n\n");

        ResultSet rs = db.query("SELECT TOP 1 TBLVISITS.PATRONID, FIRSTNAME, SURNAME, COUNT(*) AS [Number of Visits] FROM TBLVISITS, TBLPATRONS WHERE TBLVISITS.PATRONID = TBLPATRONS.PATRONID GROUP BY TBLVISITS.PATRONID, FIRSTNAME, SURNAME ORDER BY 4 DESC");
//        ResultSet rs = db.query("")
        while (rs.next()) //check the other data classes. it is there. i think this checck the number of columns porduced byt he sql
        {
            output += String.format("%-13s%-13s%-13s%-13d", rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));                //because the first thing, VIsitNo is an int

        }
        return output;
    }

    public String cardTypesBarGraph() throws SQLException
    {
        String output = "Number of patrons per card type:\n\n";

        output += String.format("%-15s%-15s%n", "Card Type", "Values");
        output += "\n";

        ResultSet rs = db.query("SELECT CARDLEVEL, COUNT(*) FROM TBLPATRONS GROUP BY CARDLEVEL;");

        while (rs.next())
        {
            output += String.format("%-15s%-15s", rs.getString(1), rs.getInt(2));
            output += "\n";
        }

        ResultSet rs1 = db.query("SELECT CARDLEVEL, COUNT(*) FROM TBLPATRONS GROUP BY CARDLEVEL;");

        List<String> categoryLabels = new ArrayList(); //in sirs one this is harcoded. We're getting rw vals from db for this
        List<Integer> values = new ArrayList();

        while (rs1.next())
        {
            //getting value for the first column and adds it to categoryLabels
            categoryLabels.add(rs1.getString(1));
            //getting value for the second column and adds it to values
            values.add(rs1.getInt(2)); //the number is the column name
        }

        DefaultCategoryDataset data = new DefaultCategoryDataset();

        for (int j = 0; j < categoryLabels.size(); j++)
        {
            data.addValue(values.get(j), "", categoryLabels.get(j));
        }
        JFreeChart barChart = ChartFactory.createBarChart("Bar Graph showing Patrons' Card Types", "Card Types", "Number of Patrons", data, PlotOrientation.VERTICAL, false, true, false);

        ChartFrame graphFrame = new ChartFrame("Card Types Bar Graph", barChart);
        graphFrame.pack();
        graphFrame.setResizable(false);
        graphFrame.setLocationRelativeTo(null);
        graphFrame.setVisible(true);

        return output;
    }

    public String getEventLocation() throws SQLException
    {

        String output = "Event Locations:\n\n";
        output += String.format("%-15s%-25s%-15s%n", "Event ID", "Event Name", "Location");
        output += "\n";

        ResultSet rs1 = db.query("SELECT EVENTID, EVENTNAME, LOCATION FROM TBLEVENTS ORDER BY LOCATION");

        //ResultSet rs = db.query("")
        while (rs1.next()) //check the other data classes. it is there. i think this checck the number of columns porduced byt he sql
        {
            output += String.format("%-15s%-25s%-15s%n", rs1.getString(1), rs1.getString(2), rs1.getString(3));                  //because the first thing, VIsitNo is an int                                   
        }

        ResultSet rs2 = db.query("SELECT LOCATION, COUNT(*) FROM TBLEVENTS GROUP BY LOCATION");

        List<String> location = new ArrayList(); //in sirs one this is harcoded. We're getting rw vals from db for this
        List<Integer> value = new ArrayList();

        while (rs2.next())
        {
            location.add(rs2.getString(1));

            value.add(rs2.getInt(2));
        }

        DefaultPieDataset data = new DefaultPieDataset();

        for (int i = 0; i < location.size(); i++)
        {
            data.setValue(location.get(i), (int) value.get(i));
        }

        JFreeChart pieChart = ChartFactory.createPieChart("Pie Chart showing Event Locations", data, true, true, false);

        ChartFrame graphFrame = new ChartFrame("Event Locations Pie Chart", pieChart);
        graphFrame.pack();
        graphFrame.setResizable(false);
        graphFrame.setLocationRelativeTo(null);
        graphFrame.setVisible(true);

        return output;
    }

    public String getPatronCardType() throws SQLException
    {

        String output = "Number of patrons per card type:\n\n";

        output += String.format("%-15s%-15s%n", "Card Type", "Values");
        output += "\n";

        ResultSet rs1 = db.query("SELECT CARDLEVEL, COUNT(*) FROM TBLPATRONS GROUP BY CARDLEVEL;");

        while (rs1.next())
        {
            output += String.format("%-15s%-15s", rs1.getString(1), rs1.getInt(2));
            output += "\n";
        }

        ResultSet rs2 = db.query("SELECT CARDLEVEL, COUNT(*) FROM TBLPATRONS GROUP BY CARDLEVEL;");

        List<String> cardType = new ArrayList(); //in sirs one this is harcoded. We're getting rw vals from db for this
        List<Integer> value = new ArrayList();

        while (rs2.next())
        {

            cardType.add(rs2.getString(1));

            value.add(rs2.getInt(2)); //the number is the column name
        }

        DefaultPieDataset data = new DefaultPieDataset();

        for (int i = 0; i < cardType.size(); i++)
        {
            data.setValue(cardType.get(i), (int) value.get(i));
        }

        JFreeChart pieChart = ChartFactory.createPieChart("Pie Chart showing Patrons' Card Types", data, true, true, false);

        ChartFrame graphFrame = new ChartFrame("Card TYpes Pie Chart", pieChart);
        graphFrame.pack();
        graphFrame.setLocationRelativeTo(null);
        graphFrame.setVisible(true);

        return output;
    }

    public String getPatronGender() throws SQLException
    {
        String output = "Patron Genders\n\n";
        output += String.format("%-15s%-15s%n", "Gender", "Values");
        output += "\n";

        ResultSet rs1 = db.query("SELECT GENDER, COUNT(*) FROM TBLPATRONS GROUP BY GENDER;");

        while (rs1.next())
        {
            output += String.format("%-15s%-15d%n", rs1.getString(1), rs1.getInt(2));
        }

        ResultSet rs2 = db.query("SELECT GENDER, COUNT(*) FROM TBLPATRONS GROUP BY GENDER;");

        List<String> gender = new ArrayList(); //in sirs one this is harcoded. We're getting rw vals from db for this
        List<Integer> value = new ArrayList();

        while (rs2.next())
        {

            gender.add(rs2.getString(1));

            value.add(rs2.getInt(2)); //the number is the column name
        }

        DefaultPieDataset data = new DefaultPieDataset();

        for (int i = 0; i < gender.size(); i++)
        {
            data.setValue(gender.get(i), (int) value.get(i));
        }

        JFreeChart pieChart = ChartFactory.createPieChart("Pie Chart showing Patrons' Gender", data, true, true, false);

        ChartFrame graphFrame = new ChartFrame("Gender Pie Chart", pieChart);
        graphFrame.pack();
        graphFrame.setResizable(false);
        graphFrame.setLocationRelativeTo(null);
        graphFrame.setVisible(true);

        return output;
    }

    public String getHighCapacityEvents() throws SQLException
    {
        //getting the number of high cap events
        ResultSet rs = db.query("SELECT COUNT(*) FROM TBLEVENTS WHERE CAPACITY >= 1000");
        int numHighCapEvents = 0;
        while (rs.next())
        {
            numHighCapEvents = rs.getInt(1);
        }
        String output = String.format("%-38s%-10s%n", "Number of high capacity events: ", numHighCapEvents) + "\n";

        //getting the list of high cap events
        ResultSet rs2 = db.query("SELECT EVENTID, EVENTNAME, CAPACITY FROM TBLEVENTS WHERE CAPACITY >= 1000 ORDER BY CAPACITY DESC");
        String listOfHighCapEvents = "";
        while (rs2.next())
        {
            //listOfHighCapEvents = rs2.getString(1) + "\t" + rs2.getString(2) + "\t" + rs2.getString(3) + "\n";
            output += String.format("%-10s%-25s%-15s%n", rs2.getString(1), rs2.getString(2), rs2.getInt(3));
        }
        output += listOfHighCapEvents + "\n";

        //getting the number of low cap events
        ResultSet rs3 = db.query("SELECT COUNT(*) FROM TBLEVENTS WHERE CAPACITY < 1000");
        int numLowCapEvents = 0;
        while (rs3.next())
        {
            numLowCapEvents = rs3.getInt(1);
        }
        output += String.format("%-38s%-10s%n", "Number of low capacity events: ", numLowCapEvents) + "\n";

        //getting the list of low cap events
        ResultSet rs4 = db.query("SELECT EVENTID, EVENTNAME, CAPACITY FROM TBLEVENTS WHERE CAPACITY < 1000 ORDER BY CAPACITY DESC");
        String listOfLowCapEvents = "";
        while (rs4.next())
        {
            //listOfHighCapEvents = rs2.getString(1) + "\t" + rs2.getString(2) + "\t" + rs2.getString(3) + "\n";
            output += String.format("%-10s%-26s%-15s%n", rs4.getString(1), rs4.getString(2), rs4.getInt(3));
        }
        output += listOfLowCapEvents + "\n";

        //putting the pie chart together
        List<String> categoryLabels = new ArrayList(); //in sirs one this is harcoded. We're getting rw vals from db for this
        List<Integer> values = new ArrayList();

        categoryLabels.add("High Capacity Events");
        categoryLabels.add("Low Capacity Events");

        values.add(numHighCapEvents);
        values.add(numLowCapEvents);

        DefaultPieDataset data = new DefaultPieDataset();

        for (int i = 0; i < categoryLabels.size(); i++)
        {
            data.setValue(categoryLabels.get(i), (int) values.get(i));
        }

        JFreeChart pieChart = ChartFactory.createPieChart("Pie Chart showing Event Capacities", data, true, true, false);

        ChartFrame graphFrame = new ChartFrame("High Capacity Events Pie Chart", pieChart);
        graphFrame.pack();
        graphFrame.setResizable(false);
        graphFrame.setLocationRelativeTo(null);
        graphFrame.setVisible(true);

        return output;
    }
}
