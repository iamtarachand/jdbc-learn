import java.sql.*;
public class GetConnection {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/learn_jdbc?autoReconnect=true&useSSL=false";
            String username = "root";
            String password = "RajMahi123@";
            Connection con = DriverManager.getConnection(url,username,password);
            if (con.isClosed()){
                System.out.println("Something wrong...");
            }else{
                System.out.println("Database Connected");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Last");
    }
}
