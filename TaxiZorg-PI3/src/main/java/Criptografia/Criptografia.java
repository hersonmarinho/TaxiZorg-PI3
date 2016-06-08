package Criptografia;

/**
 *
 * @author Fabricio e LeynerB
 */

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Criptografia {

    private static MessageDigest md = null;

    public Criptografia() {

    }

    static {
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            ex.printStackTrace();
        }
    }

    private static char[] gerarHexa(byte[] senha) {
        char[] senhaHexa = new char[senha.length * 2];
        String hexString;

        for (int i = 0; i < senha.length; i++) {
            hexString = "00" + Integer.toHexString(senha[i]);
            hexString.toUpperCase().getChars(hexString.length() - 2, hexString.length(), senhaHexa, i * 2);
        }
        return senhaHexa;
    }

    public static String gerarHash(String senha) {
        if (md != null) {
            return new String(gerarHexa(md.digest(senha.getBytes())));
        }
        return null;
    }
}