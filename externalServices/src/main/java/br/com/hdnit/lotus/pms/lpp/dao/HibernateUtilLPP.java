/*
 * 
 */

package br.com.hdnit.lotus.pms.lpp.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import br.com.hdnit.lotus.foundation.util.DataSourceEnum;
import br.com.hdnit.lotus.pms.cm.dao.IHibernateUtil;

// TODO: Auto-generated Javadoc
/**
 * The Class HibernateUtil.
 */
public class HibernateUtilLPP implements IHibernateUtil {

	private static HibernateUtilLPP instance;

	public static HibernateUtilLPP getInstance() {
		if (instance == null) {
			instance = new HibernateUtilLPP();
		}
		return instance;
	}

	/** The Constant sessionFactory. */
	private SessionFactory sessionFactory;

	/** The configuration. */
	private Configuration configuration;

	private ServiceRegistry serviceRegistry;

	/** The builder. */
	private static ServiceRegistryBuilder builder;

	public void configureCMDB(String url, String user, String pwd,DataSourceEnum dataSource) {
		try {
			System.out.println("configureCMDB inicio " );
			
			if (configuration == null) {
				System.out.println("configureCMDB criando " );
				
		
				initConfig(url, user, pwd,dataSource);
			} else {
				System.out.println("configureCMDB else " );
				
				close();

				initConfig(url, user, pwd,dataSource);

			}

		} catch (Exception ex) {
			// Make sure you log the exception, as it might be swallowed
			ex.printStackTrace();
			System.out.println("Initial SessionFactory creation failed." + ex);
			
			throw new ExceptionInInitializerError(ex);
		}
	}

	public void close() {
		if (sessionFactory != null && !sessionFactory.isClosed()) {

			getSessionFactory().close();

			configuration = null;
			builder = null;
			serviceRegistry = null;
			sessionFactory = null;
			
			System.err.println("Fechei conexao ! ");
			

		}
	}

	public void initConfig(String url, String user, String pwd,DataSourceEnum dataSource) throws Exception {
		System.out.println("initConfig inicio " );
		String urlFinal = "jdbc:firebirdsql://" + url + "?lc_ctype=UTF8";
		
		configuration = new Configuration();
		// Pass hibernate configuration file
		configuration.configure("hibernate_lpp_firebird.cfg.xml");
		
		configuration.setProperty("hibernate.connection.url", urlFinal);

		configuration.setProperty("hibernate.dialect", dataSource.getDialect());
		configuration.setProperty("hibernate.temp.use_jdbc_metadata_defaults","false");
		configuration.setProperty("hibernate.connection.driver_class", "org.firebirdsql.jdbc.FBDriver");
		configuration.setProperty("hibernate.connection.username", user);
		configuration.setProperty("hibernate.connection.password", pwd);

		builder = new ServiceRegistryBuilder();

		serviceRegistry = builder.applySettings(configuration.getProperties()).build();

		sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		System.out.println("initConfig fim " );
		
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
