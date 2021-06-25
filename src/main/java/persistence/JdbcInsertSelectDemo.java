package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcInsertSelectDemo {
    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.jdbc.Driver");       //load driver at run time
            Connection con = DriverManager.getConnection(    //get connection established
                    "jdbc:mysql://localhost:3306/sakila", "dips", "mypass123");
//here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();   //
            //stmt.executeUpdate("insert into actor");
            Scanner scanner=new Scanner(System.in);
            //int id = Integer.parseInt(args[0]);
            int id=scanner.nextInt();
            String fname = args[1];
            //fname="diapli' or 1=1 or last_name='";
           fname=scanner.next();
            String lname = args[2];
            lname=scanner.next();
            // String insertQuery="insert into actor values("+id+",'Dipalii','tolerate',now())";
            String updateQuery=String.format("update actor set first_name='%s' where actor_id=%d",fname,id);
           // String insertQuery = String.format("insert into actor values(%d,'%s','%s',now())", id, fname, lname);
            //stmt.executeUpdate("insert into actor values(4677,'Dipalii','tolerate',now())");
            // stmt.executeUpdate("insert into actor values(468,'harshada','kulkarni',now())");
            //stmt.executeUpdate(insertQuery);
           // stmt.executeUpdate(updateQuery);


            ResultSet rs = stmt.executeQuery("select * from actor where first_name='"+fname+"'");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

