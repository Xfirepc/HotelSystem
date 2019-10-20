
package Utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Utils {
    public String encode64(String msg){
        return Base64.getEncoder().encodeToString(msg.getBytes());
    }
    
    public String decode64(String msg){
        byte[] decodedBytes = Base64.getDecoder().decode(msg);
        return new String(decodedBytes);
    }
    public String encryptPass(String pass) {
        String passwordToHash = pass;
        String generatedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(passwordToHash.getBytes());
            byte[] bytes = md.digest();
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            generatedPassword = sb.toString();
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
        }
        return generatedPassword;
    }
}
