package persistence.jdbcdemo;

import java.sql.*;

public class PreparedStatementSelectDemo {

        public static void main(String[] args) throws SQLException {
            final String DB_URL = "jdbc:mysql://localhost/";
            final String USER = "dips@localhost";
            final String PASS = "mypass123";
            final String Query = "select * from deptstaff where staffName=?";
            String name = args[0];
            System.out.println("name= "+name);
            System.out.println(Query);
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/cdac", "dips", "mypass123")) {

                PreparedStatement stmt = conn.prepareStatement(Query);

                stmt.setString(1, name);

                 ResultSet rs = stmt.executeQuery();
                while(rs.next()){
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

//final String QUERY="insert ";
// final String QUERY = "SELECT *  FROM deptstaff where staffName='"+args[0]+"'";
// final String QUERY = "SELECT *  FROM deptstaff ";
