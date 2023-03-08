/*
 * 
 */

package br.com.hdnit.lotus.foundation.util;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

// TODO: Auto-generated Javadoc
/**
 * The Class BundleUtils.
 */
public class BundleUtils {

    /** The bundle msg. */
    private static ResourceBundle bundleMSG;

    /** The instance. */
    private static BundleUtils instance = null;

    /**
     * Instantiates a new bundle utils.
     */
    private BundleUtils() {

    }

    /**
     * Gets the single instance of BundleUtils.
     *
     * @return single instance of BundleUtils
     */
    public static BundleUtils getInstance() {
        if (instance == null) {
            instance = new BundleUtils();
        }
        return instance;
    }

    /**
     * getBundleMessage.
     *
     * @author <a href="mailto:jesse.freitas@hdntecnologia.com.br">Jessé</a>
     * @return ResourceBundle
     * @see 
     * @since 13/02/2009
     */
    public static ResourceBundle getBundleMessage() {

        if (bundleMSG == null) {
            try {

                bundleMSG = ResourceBundle.getBundle("messages", Locale.getDefault(), Thread.currentThread()
                                .getContextClassLoader());

            } catch (MissingResourceException e) {

                throw new RuntimeException("The 'messages.properties' file was " + "not found in classpath.");

            }

        }

        return bundleMSG;

    }

    /**
     * Gets the message.
     *
     * @param key the key
     * @return the message
     */
    public static String getMessage(String key) {
        return getBundleMessage().getString(key);
    }

}
