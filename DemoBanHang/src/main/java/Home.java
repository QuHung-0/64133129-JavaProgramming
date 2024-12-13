import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Home
{
    public static void main(String[] args)
    {
        String strConn = "jdbc:mysql://localhost:3306/demobanhang";

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection conn = DriverManager.getConnection(strConn, "root", "");
                 Statement stmt = conn.createStatement())
            {

                String sqlSelect = "SELECT * FROM SanPham";
                ResultSet rs = stmt.executeQuery(sqlSelect);

                while (rs.next())
                {
                    int id = rs.getInt(1);
                    String tenSP = rs.getString(2);
                    float giaSP = rs.getFloat(3);
                    String moTa = rs.getString(4);

                    System.out.println(id + " | " + tenSP + " | " + giaSP + " | " + moTa);
                }
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
