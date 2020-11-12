package br.com.isaccanedo;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class TextToConvertHash {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        String texto = "Isac Canedo";

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.reset();
        md.update(texto.getBytes());
        System.out.println("O Hash para " + texto + " é:");
        System.out.println(new BigInteger(1, md.digest()).toString(16));

    }
}
