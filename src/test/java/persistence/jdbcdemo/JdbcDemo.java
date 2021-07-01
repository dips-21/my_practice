package persistence.jdbcdemo;
import java.sql.*;
public class JdbcDemo {
    public static void main(String[] args) {
            final String DB_URL = "jdbc:mysql://localhost/";
            final String USER = "dips@localhost";
            final String PASS = "mypass123";
            final String QUERY = "SELECT staffName,staffAge  FROM deptstaff";

                // Open a connection
                try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/cdac", "dips", "mypass123");
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(QUERY);) {
                    // Extract data from result set
                    while (rs.next()) {
                        // Retrieve by column name
                        //System.out.print("PersonID: " + rs.getInt(1));

                        System.out.println(", StaffName: " + rs.getString(1));
                        System.out.println(",StaffAge: " + rs.getInt(2));
                      //  System.out.print(",StaffAddress: " + rs.getString("StaffAddress"));
                        //System.out.println(",MonthlyPackage: " + rs.getString("MonthlyPackage"));
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

    }
