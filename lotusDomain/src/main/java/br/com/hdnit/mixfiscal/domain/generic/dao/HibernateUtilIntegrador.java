/*
 * 
 */

package br.com.hdnit.mixfiscal.domain.generic.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import br.com.hdnit.lotus.foundation.util.BundleUtils;
import br.com.hdnit.lotus.foundation.util.PropertiesUtils;

// TODO: Auto-generated Javadoc
/**
 * The Class HibernateUtil.
 */
public class HibernateUtilIntegrador {

	/** The Constant sessionFactory. */
	private static final SessionFactory sessionFactory;

	/** The configuration. */
	private static Configuration configuration;

	/** The builder. */
	private static ServiceRegistryBuilder builder;

	static {
		try {
			configuration = new Configuration();

			// Pass hibernate configuration file
			configuration.configure("hibernate.cfg.xml");

			configuration.setProperty("hibernate.connection.url", BundleUtils.getMessage("database_integrador"));
			configuration.setProperty("hibernate.connection.username", BundleUtils.getMessage("user_integrador"));
			configuration.setProperty("hibernate.connection.password", BundleUtils.getMessage("pwd_integrador"));

			builder = new ServiceRegistryBuilder();

			ServiceRegistry serviceRegistry = builder.applySettings(configuration.getProperties()).build();

			sessionFactory = configuration.buildSessionFactory(serviceRegistry);

		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	/**
	 * Gets the session factory.
	 *
	 * @return the session factory
	 */
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void open() {
		getSessionFactory().openSession();
	}

	public static void close() {
		getSessionFactory().close();
	}

}
