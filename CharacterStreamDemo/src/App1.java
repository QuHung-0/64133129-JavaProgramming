import java.io.FileReader;
import java.io.IOException;

public class App1
{

    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("songque.txt");
        char buff[] = null;
        buff = new char[10]; // mang 10 ky tu
        fr.read(buff);       // doc file cat vao mang nay 10 ky tu
        fr.close();          // Dong file
        for (int i = 0; i < 10; i++) // in ra man hinh
        {
            System.out.println(buff[i]);
        }
        // hoac chuyen sang kei chuoi de in
        System.out.println(String.valueOf(buff));
    }

}
