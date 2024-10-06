import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App
{

    public static void main(String[] args) throws FileNotFoundException
    {
        FileOutputStream fout = null;
        try
        {
            fout = new FileOutputStream("num.clc");

        } catch (FileNotFoundException e)
        {
            System.out.print("File khong co, xem lai");
        }
        // ghi du lieu vao file
        try
        {
            for (int i = 1; i < 127; i++)
                fout.write(i);
            fout.flush();
            fout.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("Done");

    }


}
