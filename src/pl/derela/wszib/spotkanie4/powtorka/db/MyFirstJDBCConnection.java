package pl.derela.wszib.spotkanie4.powtorka.db;

import java.sql.*;

public class MyFirstJDBCConnection {

    public static void main(String[] args) {

        String connectionUrl = "jdbc:sqlserver://morfeusz.wszib.edu.pl:1433;user=derela;password=****;databaseName=AdventureWorks";

        String sql = "SELECT Top 15 *  FROM Person.Contact";

        try (
                Connection con =  DriverManager.getConnection(connectionUrl);
                Statement stmt  = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                ) {
           /*Connection con =  DriverManager.getConnection(connectionUrl);
            Statement stmt  = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);*/         // przenoszę do try

            while (rs.next()) {
                System.out.println(rs.getString("FirstName")+ " " + rs.getString("LastName"));
            }



            /*rs.close();
            stmt.close();
            con.close();*/   /// bo przeniosłem do try  wywołania


        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
