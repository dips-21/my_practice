package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sakila", "dips", "mypass123");
//here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();
            //stmt.executeUpdate("insert into actor values(4677,'Dipalii','tolerate',now())");
            stmt.executeUpdate("insert into actor values(4677,'Dipalii','tolerate',now())");
           // ResultSet rs = stmt.executeQuery("select * from actor limited 100");
            ResultSet rs = stmt.executeQuery("select * from actor");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

            }
           // Actor
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
//java heap ke bahar native memory me allocate hua hai so usko close krna jaruri hai!
