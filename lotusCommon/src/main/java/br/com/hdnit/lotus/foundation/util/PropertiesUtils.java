/*
 * 
 */

package br.com.hdnit.lotus.foundation.util;

import java.util.Properties;

// TODO: Auto-generated Javadoc
/**
 * The Class BundleUtils.
 */
public class PropertiesUtils {

	private Properties applicationProperties = null;

	/** The instance. */
	private static PropertiesUtils instance = null;

	/**
	 * Instantiates a new bundle utils.
	 */
	private PropertiesUtils() {

	}

	/**
	 * Gets the single instance of BundleUtils.
	 *
	 * @return single instance of BundleUtils
	 */
	public static PropertiesUtils getInstance() {
		if (instance == null) {
			instance = new PropertiesUtils();
		}
		return instance;
	}

	public Properties getApplicationProperties() {
		if (applicationProperties == null) {
			applicationProperties = new Properties();
		}
		return applicationProperties;
	}

	public void setApplicationProperties(Properties applicationProperties) {
		this.applicationProperties = applicationProperties;
	}

	public static String getProperties(String key) {
		return getInstance().getApplicationProperties().getProperty(key);
	}

}
