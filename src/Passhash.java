
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sewar
 */
public class Passhash {
    
    
 public static String hashPassword(String password) throws NoSuchAlgorithmException{

            MessageDigest md = MessageDigest.getInstance("MD5");// md522 or SHA
            md.update(password.getBytes());
            byte[] b = md.digest();
            StringBuffer sb = new StringBuffer();
            for(byte b1:b)
            {
                sb.append(Integer.toHexString(b1 & 0xff).toString());
            }
     System.out.println(sb.toString());
           return sb.toString();
        }
 
    public static void main(String[] args) {
        String password="password";
        System.out.println(password);
        try {
             System.out.println(hashPassword(password));
        } catch (NoSuchAlgorithmException e) {
          //  System.out.println(e);
        }
        
    
 
 
    } 
    
}
