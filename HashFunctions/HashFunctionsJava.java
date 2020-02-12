package com.company;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) {
	    String s = "My name is";
        System.out.println(s);
        System.out.println("MD5: "+(getMd5(s)));
        System.out.println("Sha1: "+getSha1(s));
    }

    public static String getMd5(String input){
       try{
           MessageDigest md = MessageDigest.getInstance("MD5");
           byte[] messageDigest = md.digest(input.getBytes());


           BigInteger no = new BigInteger(1, messageDigest);

           //Into hex value
           String hashtext = no.toString(16);

           // Add preceding 0s to make it 32 bit
           while (hashtext.length() < 32) {
               hashtext = "0" + hashtext;
           }
           return hashtext;
       }
       catch(NoSuchAlgorithmException e){
           throw new RuntimeException(e);
       }
    }

    public static String getSha1(String input)
    {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] messageDigest = md.digest(input.getBytes());

            BigInteger no = new BigInteger(1, messageDigest);
            //Into hex value
            String hashtext = no.toString(16);

            // Add preceding 0s to make it 32 bit
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }

            return hashtext;
        }

        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
