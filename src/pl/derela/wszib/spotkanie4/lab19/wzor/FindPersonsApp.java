/*
package pl.derela.wszib.spotkanie4.lab19.wzor;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.*;

public class FindPersonsApp {

    private static final String DB_HOST = "morfeusz.wszib.edu.pl";
    private static final int DB_PORT = 1433;
    private static final String DB_USER = "derela";
    private static final String DB_PASS = "******";
    private static final String DB_NAME = "AdventureWorks";

    private static final String SQL =
    "select top 10 * from Person.Contact WHERE LastName like ?";

    public static void main(String[] args) {

        if (args.length = 0) {
            System.out.println("Nie podano nazwiska");
            System.exit(1);
        }

        FindPersonsApp fpa = new FindPersonsApp();



        try ( Connection con = fpa.connect();
              */
/*Statement stmt = con.createStatement();*//*


              PreparedStatement ps = con.prepareStatement(SQL)
              */
/*ResultSet rs = stmt.executeQuery(SQL)*//*
) {

            ps.setString(1,args[0]+"%");
            ResultSet rs = ps.executeQuery();

            if (!rs.next()) {
                System.out.println("Nie znaleziono osób");
            } else {
                do{ System.out.println( rs.getString("FirstName") + " " + rs.getString("LastName"));

            }


            while (rs.next())


        } catch (SQLException e) {
            System.out.println("Błąd!" + e.getMessage());
            e.printStackTrace();
        }
    }




    private Connection connect() throws SQLServerException {

        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(DB_USER);
        ds.setPassword(DB_PASS);
        ds.setDatabaseName(DB_NAME);
        ds.setServerName(DB_HOST);
        ds.setPortNumber(DB_PORT);
        return ds.getConnection();
    }



}
*/
