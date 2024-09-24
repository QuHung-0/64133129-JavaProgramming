import java.util.ArrayList;
import java.util.List;

public class ArrayCandy 
{
    private List<String> candyColors;

    public ArrayCandy()
    {
        candyColors = new ArrayList<>();
    }

    public void addColor(String color)
    {
        candyColors.add(color);
        System.out.println("Đã thêm màu: " + color);
    }

    public void trimToSize()
    {
        ((ArrayList<String>) candyColors).trimToSize();
        System.out.println("Kích thước đã được cắt về kích thước hiện tại.");
    }

    public void ensureCapacity(int minCap)
    {
        ((ArrayList<String>) candyColors).ensureCapacity(minCap);
        System.out.println("Đã đảm bảo dung lượng tối thiểu: " + minCap);
    }

    public void clearColors()
    {
        candyColors.clear();
        System.out.println("Đã xóa tất cả màu kẹo.");
    }

    public boolean containsColor(String color)
    {
        return candyColors.contains(color);
    }

    public int size()
    {
        return candyColors.size();
    }

    public void printColors() 
    {
        System.out.println("Danh sách màu kẹo: " + candyColors);
    }
}
