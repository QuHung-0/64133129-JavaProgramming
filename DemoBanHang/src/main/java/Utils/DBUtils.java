package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
    static public Connection DBConnect () throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        String strConn = "jdbc:mysql://localhost:3306/demobanhang";
        Connection strconn = DriverManager.getConnection(strConn,"root","");
        return strconn;
    }
}
