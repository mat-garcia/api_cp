/*
 * 
 */

package br.com.hdnit.lotus.pms.cm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import br.com.hdnit.lotus.foundation.util.DataSourceEnum;

// TODO: Auto-generated Javadoc
/**
 * The Class HibernateUtil.
 */
public class HibernateUtilCMSqlServer  implements IHibernateUtil {

	private static HibernateUtilCMSqlServer instance;

	public static HibernateUtilCMSqlServer getInstance() {
		if (instance == null) {
			instance = new HibernateUtilCMSqlServer();
		}
		return instance;
	}

	private ServiceRegistry serviceRegistry;

	/** The Constant sessionFactory. */
	private SessionFactory sessionFactory;

	/** The configuration. */
	private Configuration configuration;

	/** The builder. */
	private static ServiceRegistryBuilder builder;

	public void configureCMDB(String url, String user, String pwd, DataSourceEnum dataSource) {
		try {
			if (configuration == null) {
				configuration = new Configuration();
				// Pass hibernate configuration file
				configuration.configure("hibernate_sql_server.cfg.xml");

				
				initConfig(url,user,pwd,dataSource);
			} else {

				close();

				initConfig(url,user,pwd,dataSource);

			}

		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public void close() {
		if (sessionFactory != null && !sessionFactory.isClosed()) {

			getSessionFactory().close();

		}
	}

	public void initConfig(String url, String user, String pwd,DataSourceEnum dataSource) throws Exception {
		String urlFinal = "jdbc:jtds:sqlserver://"+url;
		
		configuration.setProperty("hibernate.connection.url", urlFinal);
		configuration.setProperty("hibernate.dialect", dataSource.getDialect());
		configuration.setProperty("hibernate.temp.use_jdbc_metadata_defaults","false");
		configuration.setProperty("hibernate.connection.driver_class", "net.sourceforge.jtds.jdbc.Driver");
		configuration.setProperty("hibernate.connection.username", user);
		configuration.setProperty("hibernate.connection.password", pwd);
		
		builder = new ServiceRegistryBuilder();

		serviceRegistry = builder.applySettings(configuration.getProperties()).build();

		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	}

	/**
	 * Gets the session factory.
	 *
	 * @return the session factory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
