package pl.derela.wszib.spotkanie4.db;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class MyFirstJdbcConnection {

    public static void main(String[] args) {
        String connectionUrl =
                "jdbc:sqlserver://morfeusz.wszib.edu.pl:1433;user=derela;password=*****;databaseName=AdventureWorks";

        String sql = "select top 10 * from Person.Contact";



        try ( Connection con = DriverManager.getConnection(connectionUrl);
              Statement stmt = con.createStatement();
              ResultSet rs = stmt.executeQuery(sql) )  {
            /*Connection con = DriverManager.getConnection(connectionUrl); przenoszę do try ()
            Statement stmt = con.createStatement();*/

            /*ResultSet rs = stmt.executeQuery(sql);*/

            while (rs.next()) {
                System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));

            }

           /* rs.close();*/
            /*stmt.close();
            con.close();*/

        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}
