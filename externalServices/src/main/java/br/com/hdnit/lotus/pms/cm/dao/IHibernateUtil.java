package br.com.hdnit.lotus.pms.cm.dao;

import org.hibernate.SessionFactory;

import br.com.hdnit.lotus.foundation.util.DataSourceEnum;

public interface IHibernateUtil {
	public void configureCMDB(String url, String user, String pwd,DataSourceEnum dataSource);

	public void close();

	public void initConfig(String url, String user, String pwd,DataSourceEnum dataSource) throws Exception;

	public SessionFactory getSessionFactory();

}
