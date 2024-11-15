import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Home {

		public static void main(String[] args) throws ClassNotFoundException, SQLException
		{

			//1. Đăng kí diview
			Class.forName("com.mysql.jdbc.Driver");
			
			//2. Mo ket noi
			//2.1 chuoi ket noi
			String strConn = "jdbc:mysql://localhost:3306/demobanhang";
			Connection conn = DriverManager.getConnection(strConn, "root", "");
			
			// Select
			String sqlSelect = "select * from SanPham";
			Statement lenh = conn.createStatement();
			ResultSet ketQua = lenh.executeQuery(sqlSelect);
			
			//Hien ket qua
			while(ketQua.next())
			{
				int id = ketQua.getInt(1); //lay du lieu cot 0
				String tenSP = ketQua.getString(2);
				float giaSP = ketQua.getFloat(3);
				String moTa = ketQua.getString(4);

				System.out.println(id + " | " + tenSP +  " | " + giaSP + " | " + moTa);

			}
			// SanPham sp1 = new SP(...)
			//lstsp.add(sp1)
		}
}
