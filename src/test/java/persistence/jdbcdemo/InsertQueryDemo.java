package persistence.jdbcdemo;

import java.sql.*;

public class InsertQueryDemo {
    public static void main(String[] args) {
       // args=new String[]{"9","'dips' 25,'a', 5) ,(","25", "aurangabad", "40000"};//NumberFormatException
        final String DB_URL = "jdbc:mysql://localhost/";
        final String USER = "dips@localhost";
        final String PASS = "mypass123";

        //final String QUERY = "SELECT *  FROM deptstaff where staffName='"+args[0]+"'";
        int PersonID=Integer.parseInt(args[0]);
        String name = args[1];
        int age = Integer.parseInt(args[2]);
        String address = args[3];
        int monthlyPackage = Integer.parseInt(args[4]);

        final String queryPattern = "insert into deptstaff values(%d,'%s', %d,'%s',%d)";
        //final String queryPattern = "insert into deptstaff values(%d,'%s', %d,'%s',%d)";
        String Query = String.format (queryPattern,PersonID,name,age,address,monthlyPackage);
        System.out.println(Query);
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/cdac", "dips", "mypass123")){
             Statement stmt = conn.createStatement();
           //int success=  stmt.executeUpdate(Query);
           int success=  stmt.executeUpdate(Query);
            System.out.println("result "+success);
            //final String QUERY = "SELECT * from deptstaff";
    }catch (Exception e){
            System.out.println(e);
        }

}

}

