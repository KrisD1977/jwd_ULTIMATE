package pl.derela.wszib.spotkanie4.powtorka.db;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.*;
import java.text.NumberFormat;

public class HomeBudget {

    private static final String DB_HOST = "morfeusz.wszib.edu.pl";
    private static final int DB_PORT = 1433;
    private static final String DB_USER = "derela";
    private static final String DB_PASS = "Yu****";
    private static final String DB_NAME = "derela";
    private static final String INSERT_ENTRY_SQL =
            "insert into Budget.BudgetEntries (EntryName, Amount) values (?,?)";
    private static final String GET_BALANCE_SQL =
            "select SUM(Amount) AS Balance from Budget.BudgetEntries";

    public static void main(String[] args) {

        // validation required
        BudgetEntry budgetEntry = new BudgetEntry();
        budgetEntry.setEntryName(args[0]);
        budgetEntry.setAmount(new BigDecimal(args[1]));

        HomeBudget homeBudget = new HomeBudget();
        try ( Connection con = homeBudget.connect();
              Statement stmt = con.createStatement()


        ) {
            BigDecimal balance;

            PreparedStatement ps = con.prepareStatement(INSERT_ENTRY_SQL);
            ps.setString(1, budgetEntry.getEntryName());
            ps.setBigDecimal(2,budgetEntry.getAmount());
            ps.execute();

            ResultSet rs = stmt.executeQuery(GET_BALANCE_SQL);
            if (rs.next()) {
                balance = rs.getBigDecimal("Balance");
            } else {balance = new BigDecimal(0);}

            System.out.print("Zapisano! kwota: "+currencyFormat(budgetEntry.getAmount() ));
            System.out.print(", nazwa: " +budgetEntry.getEntryName());
            System.out.print(", saldo: " + currencyFormat(balance));

            ps.close();

        } catch ( SQLException e) {
            System.out.println("Błąd! Wystąpił błąd z bazą danych: " +e.getMessage());
        }

    }

    private Connection connect () throws SQLServerException {

        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(DB_USER);
        ds.setPassword(DB_PASS);
        ds.setServerName(DB_HOST);
        ds.setPortNumber(DB_PORT );
        ds.setDatabaseName(DB_NAME);

        return ds.getConnection();

    }

    public static String currencyFormat (BigDecimal n) {
        return NumberFormat.getCurrencyInstance().format(n);

    }

}
