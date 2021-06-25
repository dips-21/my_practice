package persistence;

import java.sql.*;

public class JdbcAssignment {

        public static void main(String[] args) throws Exception {
            int price = Integer.parseInt(args[0]);
            int stock = Integer.parseInt(args[1]);
            Date today = new Date(System.currentTimeMillis());
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost/xe", "scott", "tiger");
            con.setAutoCommit(false); //beginning an explicit transaction
            try{
                Statement stmt = con.createStatement();
                stmt.executeUpdate("update counters set cur_val=cur_val+1 where ctr_name='orders'");
                ResultSet rs = stmt.executeQuery("select cur_val+1000 from counters where ctr_name='orders'");
                rs.next();
                int orderNo = rs.getInt(0);
                rs.close();
                stmt.close();
               // PreparedStatement pstmt = con.prepareStatement("insert into orders values (?, ?, ?, ?, ?)");
                PreparedStatement pstmt = con.prepareStatement("select * from item where price=? and stock=?");
                pstmt.setDouble(0,price);
                pstmt.setInt(1, stock);
                ResultSet resultSet=pstmt.executeQuery();
                while (resultSet.next()){
                  int item= resultSet.getInt(0);
                }
                pstmt.close();
                con.commit();
                System.out.printf("New Order Number: %d%n", orderNo);
            }catch(SQLException e){
                con.rollback();
                System.out.printf("Order Failed: %s%n", e.getMessage());
            }
            con.close();
        }
    }


