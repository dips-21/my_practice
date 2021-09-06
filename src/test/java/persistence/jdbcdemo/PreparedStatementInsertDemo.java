package persistence.jdbcdemo;

import java.sql.*;

public class PreparedStatementInsertDemo {

    public static void main(String[] args) throws SQLException {
        final String DB_URL = "jdbc:mysql://localhost/";
        final String USER = "dips@localhost";
        final String PASS = "mypass123";
        final String Query = "insert into deptstaff values(?,?,?,?,?)";
        int PersonID = Integer.parseInt(args[0]);
        String name = args[1];
        int age = Integer.parseInt(args[2]);
        String address = args[3];
        int monthlyPackage = Integer.parseInt(args[4]);

        System.out.println(Query);
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/cdac",
                "dips", "mypass123")) {

            PreparedStatement stmt = conn.prepareStatement(Query);
            stmt.setInt(1, PersonID);
            stmt.setString(2, name);
            stmt.setInt(3, age);
            stmt.setString(4, address);
            stmt.setInt(5, monthlyPackage);
           int rs= stmt.executeUpdate();
          //  int rs = stmt.executeUpdate(Query);
            {
                System.out.println("result " + rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

//final String QUERY="insert ";
// final String QUERY = "SELECT *  FROM deptstaff where staffName='"+args[0]+"'";
// final String QUERY = "SELECT *  FROM deptstaff ";