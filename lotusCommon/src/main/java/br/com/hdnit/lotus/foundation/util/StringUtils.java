/*
 * 
 */

package br.com.hdnit.lotus.foundation.util;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.lang.StringEscapeUtils;

// TODO: Auto-generated Javadoc
/**
 * The Class StringUtils.
 */
public class StringUtils {

	/**
	 * Convert iso88591t o utf8.
	 *
	 * @param value
	 *            the value
	 * @return the string
	 */
	public static String convertIso88591tOUtf8(Object value) {
		return fixEncoding((String) value);

	}

	/**
	 * Fix encoding.
	 *
	 * @param latin1
	 *            the latin1
	 * @return the string
	 */
	public static String fixEncoding(String latin1) {
		try {
			byte[] bytes = latin1.getBytes("ISO-8859-1");
			if (!validUTF8(bytes))
				return latin1;
			return new String(bytes, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// Impossible, throw unchecked
			throw new IllegalStateException("No Latin1 or UTF-8: " + e.getMessage());
		}

	}

	/**
	 * Fix encoding2.
	 *
	 * @param latin1
	 *            the latin1
	 * @return the string
	 */
	public static String fixEncoding2(String latin1) {
		try {
			byte[] bytes = latin1.getBytes("UTF-8");
			return new String(bytes, "ISO-8859-1");
		} catch (UnsupportedEncodingException e) {
			// Impossible, throw unchecked
			throw new IllegalStateException("No Latin1 or UTF-8: " + e.getMessage());
		}

	}

	/**
	 * Valid ut f8.
	 *
	 * @param input
	 *            the input
	 * @return true, if successful
	 */
	private static boolean validUTF8(byte[] input) {
		int i = 0;
		// Check for BOM
		if (input.length >= 3 && (input[0] & 0xFF) == 0xEF && (input[1] & 0xFF) == 0xBB & (input[2] & 0xFF) == 0xBF) {
			i = 3;
		}

		int end;
		for (int j = input.length; i < j; ++i) {
			int octet = input[i];
			if ((octet & 0x80) == 0) {
				continue; // ASCII
			}

			// Check for UTF-8 leading byte
			if ((octet & 0xE0) == 0xC0) {
				end = i + 1;
			} else if ((octet & 0xF0) == 0xE0) {
				end = i + 2;
			} else if ((octet & 0xF8) == 0xF0) {
				end = i + 3;
			} else {
				// Java only supports BMP so 3 is max
				return false;
			}

			while (i < end) {
				i++;
				if (i < input.length) {
					octet = input[i];
				}
				if ((octet & 0xC0) != 0x80) {
					// Not a valid trailing byte
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Gets the browser type.
	 *
	 * @param currValue
	 *            the curr value
	 * @return the browser type
	 */
	public static String getBrowserType(String currValue) {
		String browser = new String("");
		String version = new String("");
		if (currValue != null) {
			if ((currValue.indexOf("MSIE") == -1) && (currValue.indexOf("msie") == -1)) {
				browser = "NS";
				int verPos = currValue.indexOf("/");
				if (verPos != -1)
					version = currValue.substring(verPos + 1, verPos + 5);
			} else {
				browser = "IE";
				String tempStr = currValue.substring(currValue.indexOf("MSIE"), currValue.length());
				version = tempStr.substring(4, tempStr.indexOf(";"));

			}

		}
		// System.out.println(" now browser type is " + browser + " " +
		// version);

		return browser + " " + version;

	}

	/**
	 * Creates the hash for user password.
	 *
	 * @param passwd
	 *            the passwd
	 * @return the string
	 */
	public String createHashForUserPassword(String passwd) {
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

	public static String escapeSql(String value) {
		return StringEscapeUtils.escapeSql(value);

	}
	
	public static String UTF8toISO(String str){
        Charset utf8charset = Charset.forName("UTF-8");
        Charset iso88591charset = Charset.forName("ISO-8859-1");

        ByteBuffer inputBuffer = ByteBuffer.wrap(str.getBytes());

        // decode UTF-8
        CharBuffer data = utf8charset.decode(inputBuffer);

        // encode ISO-8559-1
        ByteBuffer outputBuffer = iso88591charset.encode(data);
        byte[] outputData = outputBuffer.array();

        return new String(outputData);
    }

}
