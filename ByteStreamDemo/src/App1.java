import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class App1
{

    public static void main(String[] args) throws IOException
    {
        FileInputStream fout = null;
        fout = new FileInputStream("num.clc");
        int byteRead;
        while (true)
        {
            byteRead = fout.read();
            if(byteRead == -1) break;
            System.out.println(byteRead);
            System.out.println(" ");
        }

        System.out.println("Done");
    }


}
