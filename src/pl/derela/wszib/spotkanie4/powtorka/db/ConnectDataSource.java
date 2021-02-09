package pl.derela.wszib.spotkanie4.powtorka.db;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDataSource {

    public static void main(String[] args) {

        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("derela");
        ds.setPassword("Y****");
        ds.setServerName("morfeusz.wszib.edu.pl");
        ds.setPortNumber(1433);
        ds.setDatabaseName("derela");

        String sql = "SELECT * from forum.Topics";

        try (Connection con = ds.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            String topicBody;
            int id;
            String topicSubject;
            int parentID;

            while (rs.next()){
                if ((topicBody = rs.getString("TopicBody")) !=null)  {
                    id = rs.getInt("ID");
                    parentID = rs.getInt("ParentID");
                    topicSubject = rs.getString("TopicSubject");
                    System.out.println(id + " - "+ parentID + " - "+ topicSubject+" - "+ topicBody);

                }
            }

        } catch (SQLException e) {
            System.out.println("Wystąpił problem z bazą danych: " +e.getMessage());
            e.printStackTrace();
        }


    }
}
