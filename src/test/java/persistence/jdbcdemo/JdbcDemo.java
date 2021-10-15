package persistence.jdbcdemo;
import java.sql.*;
public class JdbcDemo {
    public static void main(String[] args) {
            final String DB_URL = "jdbc:mysql://localhost/";
            final String USER = "dips1";
            final String PASS = "MySqlp8ss";

            // final String QUERY = "SELECT *  FROM deptstaff where staffName='"+args[0]+"'";
             final String QUERY = "SELECT *  FROM deptstaff ";
        //String ageInput = args[0];
        String ageInput = "15";
        System.out.println(ageInput);
        //final String QUERY = "SELECT *  FROM deptstaff where staffAge="+ ageInput;
       /*String msg="select name from table where age=%s";
          String.format(msg,10);*/
                // Open a connection
        System.out.println(QUERY);
                try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/cdac", USER, PASS);
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(QUERY);) {
                    // Extract data from r
                    // result set
                    while (rs.next()) {
                        // Retrieve by column name
                        //System.out.print("PersonID: " + rs.getInt(1));

                        System.out.print("StaffName: " + rs.getString("StaffName"));
                        System.out.print(",StaffAge: " + rs.getInt( "StaffAge"));
                       System.out.print(",StaffAddress: " + rs.getString("StaffAddress"));
                        System.out.println(",MonthlyPackage: " + rs.getString("MonthlyPackage"));
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

    }
