import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException
    {
        FileWriter fw;
        fw = new FileWriter("songque.txt");

        fw.write("Sông quê nước chảy đôi bờ\n" +
                "Để anh chín dại 10 khờ .. thương .... em");
        
        fw.flush();
        fw.close();
    }
}
