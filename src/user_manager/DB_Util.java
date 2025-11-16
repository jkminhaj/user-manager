package user_manager;
import java.sql.* ;
public class DB_Util {
    private static Connection conn ;
    public static Connection getConnection(){ 
        String dbUrl = "jdbc:mysql://localhost:3307/users_db";
//        String dbUrl = "jdbc:mysql://localhost:3307/mydb";
        String userName = "root";
        String password = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbUrl,userName,password);
            if(conn!=null){
                System.out.println("Database Connected");
            }   
        }
        catch(SQLException ex){
            System.out.println("SQL Error : "+ ex);
        }
        catch(Exception ex){
            System.out.println("Error : "+ ex);
        }
        return conn ;
    }
}
