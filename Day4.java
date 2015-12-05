import java.security.*;
import java.util.*;
import java.math.*;
public class Day4 {
    public static void main () {
        String init = "bgvyzdsv";
        int key = -1;
        byte[] thedigest;
        try {
            do {
                key++;
                String input = init+key;
                byte[] bytesOfMessage = input.getBytes();
                MessageDigest md = MessageDigest.getInstance("MD5");
                thedigest = md.digest(bytesOfMessage);
            } while (!(toHex(thedigest).substring(0,6).equals("000000")));
        } catch (Exception e) { System.err.println(e);  }
        System.out.println(key);
    }
    
    public static String toHex(byte[] bytes) {
        BigInteger bi = new BigInteger(1, bytes);
        return String.format("%0" + (bytes.length << 1) + "x", bi);
    }
    
}

