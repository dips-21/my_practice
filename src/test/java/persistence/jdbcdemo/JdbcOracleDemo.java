package persistence.jdbcdemo;

import java.sql.*;

public class JdbcOracleDemo {
    public static void main(String[] args) {
        //final String DB_URL = "jdbc:mysql://localhost/";
        final String DB_URL = "jdbc:oracle:thin:@//192.168.5.146/xe";
        final String USER = "scott";
        final String PASS = "tiger";

        // final String QUERY = "SELECT *  FROM deptstaff where staffName='"+args[0]+"'";
        final String QUERY = "SELECT *  FROM ORDERS ";
        String ageInput = "25";
        //String ageInput = args[0];
        System.out.println(ageInput);
        //final String QUERY = "SELECT *  FROM deptstaff where staffAge="+ ageInput;
/*String msg="select name from table where age=%s";
String.format(msg,10);*/
        // Open a connection
        System.out.println(QUERY);
        try(//Connection conn = DriverManager.getConnection(URL, USER, PASS);
            Connection conn= DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
            // Extract data from r
            // result set
            while (rs.next()) {
                // Retrieve by column name
                //System.out.print("PersonID: " + rs.getInt(1));

                System.out.print("OrderNumber: " + rs.getString("ORD_NO"));
                System.out.print(",OrderDate: " + rs.getInt( "ORD_DATE"));
                System.out.print(",Order_ID: " + rs.getString("CUST_ID"));
                System.out.println(",PNO: " + rs.getString("PNO"));
                System.out.println(",QTY: " + rs.getString("QTY"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
