import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class App
{
	public static void main(String[] args)
	{
		Map<String, String> tuDien = new HashMap<String, String>();
		
		tuDien.put("Apple", "Quả Táo");
		tuDien.put("Orange", "Quả Cam");
		tuDien.put("Cat", "Con mèo");
		tuDien.put("Dog", "Con chó");
		tuDien.put("Plant", "Cây");
		tuDien.put("Plane", "Máy bay");
		tuDien.put("White", "Trắng");
		tuDien.put("Black", "Đen");
		tuDien.put("Table", "Bàn");
		tuDien.put("Chair", "Ghế");
		
		Scanner tuNhap = new Scanner(System.in);
        
		
		System.out.print("Nhập một từ tiếng Anh: ");
        String tuTiengAnh = tuNhap.nextLine();
       
        String nghiaTiengViet = tuDien.get(tuTiengAnh);
        
   
        if (nghiaTiengViet != null) {
            System.out.println("Nghĩa tiếng Việt: " + nghiaTiengViet);
        } else {
            System.out.println("Từ không có trong từ điển.");
        }
	}
	
}