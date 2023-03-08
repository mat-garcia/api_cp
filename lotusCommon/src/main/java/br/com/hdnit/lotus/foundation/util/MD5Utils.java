/*
 * 
 */

package br.com.hdnit.lotus.foundation.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// TODO: Auto-generated Javadoc
/**
 * The Class MD5Utils.
 */
public class MD5Utils {

    /**
     * Creates the hash for user password.
     *
     * @param passwd the passwd
     * @return the string
     */
    public static String createHashForUserPassword(String passwd) {
        String generatedHash = null;
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            generatedHash = new BigInteger(1, md.digest(passwd.getBytes())).toString(16);

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        return generatedHash;
    }

    /**
     * Validate password hash.
     *
     * @param hash the hash
     * @param password the password
     * @return true, if successful
     */
    public static boolean validatePasswordHash(String hash, String password) {
        boolean ret = false;

        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
            String generatedHash = new BigInteger(1, md.digest(password.getBytes())).toString(16);

            if (hash != null) {
                ret = hash.equals(generatedHash);
            }
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

        return ret;
    }

}
