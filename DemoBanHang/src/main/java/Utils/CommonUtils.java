package Utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CommonUtils
{

    public static String encodePass(String passPlainText)
    {
        try
        {
            MessageDigest md = MessageDigest.getInstance("MD5");

            md.update(passPlainText.getBytes());

            byte[] bytes = md.digest();

            StringBuilder sb = new StringBuilder();
            for (byte b : bytes)
            {
                sb.append(String.format("%02x", b));
            }

            return sb.toString();
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}

