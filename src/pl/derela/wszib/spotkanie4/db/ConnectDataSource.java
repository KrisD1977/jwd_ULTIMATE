package pl.derela.wszib.spotkanie4.db;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConnectDataSource {

    public static void main(String[] args) {

        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("derela");
        ds.setPassword("Y*****");
        ds.setServerName("morfeusz.wszib.edu.pl");
        ds.setPortNumber(1433);
        ds.setDatabaseName("derela");


        String sql = "select * from Forum.Topics";

        try (Connection con = ds.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)
        ) {
            String topicBody;
            int id;

            while (rs.next()) {
                if ((topicBody = rs.getString("TopicBody")) !=null) {
                    id = rs.getInt("ID");
                    System.out.println(id + "-" + topicBody);
                }
            }

        } catch(SQLException e) {
            /*System.out.println("Błąd! Wystąpił problem z bazą danych: " + e.getMessage);*/
        }

    }
}
