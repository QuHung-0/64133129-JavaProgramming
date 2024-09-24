public class App 
{
    public static void main(String[] args) 
    {
        ArrayCandy arraycandy = new ArrayCandy();

        arraycandy.addColor("Đỏ");
        arraycandy.addColor("Xanh");
        arraycandy.addColor("Vàng");

        arraycandy.printColors();

        System.out.println("Số lượng màu kẹo: " + arraycandy.size());

        arraycandy.ensureCapacity(10);

        arraycandy.trimToSize();

        String checkColor = "Xanh";
        if (arraycandy.containsColor(checkColor))
        {
            System.out.println("Danh sách chứa màu: " + checkColor);
        } 
        else 
        {
            System.out.println("Danh sách không chứa màu: " + checkColor);
        }

        arraycandy.clearColors();
        arraycandy.printColors();
    }
}
