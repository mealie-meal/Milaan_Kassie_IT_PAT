package dataPkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManager
{

    Connection conn;

    public DbManager() 
    {
        try
        {
            String filename = "CasinoRecordsV3.accdb";

            conn = DriverManager.getConnection("jdbc:ucanaccess://" + filename); //we were told that all that will change is the filename over her. Nothign else needs to be changed for it to work

        } catch (Exception e)
        {
            //System.out.println(e.toString());
            System.out.println(e.toString());
        }
    }

    public ResultSet query(String SQL) throws SQLException
    {
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(SQL);
        return result;
    }

    public int update(String SQL) throws SQLException
    {
        Statement stmt = conn.createStatement();
        int done = stmt.executeUpdate(SQL);
        return done;
    }

    public int updateReturnID(String SQL) throws SQLException
    {
        Statement stmt = conn.createStatement();
        int id = -1;
        stmt.executeUpdate(SQL, Statement.RETURN_GENERATED_KEYS);
        ResultSet result = stmt.getGeneratedKeys();
        if (result.next())
        {
            id = result.getInt(1);
        }
        return id;
    }
}
