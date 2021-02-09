package pl.derela.wszib.spotkanie4.powtorka.lab19;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.*;

public class FindPersonsApp {
    private static final String DB_HOST = "morfeusz.wszib.edu.pl";
    private static final int DB_PORT = 1433;
    private static final String DB_USER = "derela";
    private static final String DB_PASS = "******";
    private static final String DB_NAME = "AdventureWorks";
    private static final String SELECT_PERSON =
            "select top 10 * from Person.Contact WHERE LastName like 'Anderson'";

    private static final String SELECT_NAME =
            "select top 10 * from Person.Contact WHERE LastName like ? ";


    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Nie podano nazwiska.");
            System.exit(-1);
        }

        FindPersonsApp findPersonsApp = new FindPersonsApp();

        try ( Connection con = findPersonsApp.connect();
             /* Statement stmt = con.createStatement();
              ResultSet rs = stmt.executeQuery(SELECT_PERSON)*/
              PreparedStatement ps = con.prepareStatement(SELECT_NAME);

                ) {
            ps.setString(1,args[0]+"%");
            ResultSet rs = ps.executeQuery();

            if (!rs.next()) {
                System.out.println("Nie znaleziono osób");
            } else {

            do {
                System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
            }while (rs.next());
            }

        } catch (SQLException e) {
            System.out.println("Błąd w połączeniu z bazą: " +e.getMessage());
        }
    }



    private Connection connect() throws SQLServerException {

        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(DB_USER);
        ds.setPassword(DB_PASS);
        ds.setServerName(DB_HOST);
        ds.setPortNumber(DB_PORT);
        ds.setDatabaseName(DB_NAME);

        return ds.getConnection();

    }
}
