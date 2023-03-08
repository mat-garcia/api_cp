
package br.com.hdnit.lotus.foundation.util;

public enum DataSourceEnum {
    ORACLE("ORACLE","oracle.jdbc.OracleDriver","org.hibernate.dialect.Oracle10gDialect","jdbc:oracle:thin:@//"),
    FIREBIRD("FIREBIRD","org.firebirdsql.jdbc.FBDriver","br.com.hdnit.lotus.pms.lpp.dao.Firebird21Dialect","jdbc:firebirdsql://"),
    SQL_SERVER("SQL SERVER","net.sourceforge.jtds.jdbc.Driver","org.hibernate.dialect.SQLServer2012Dialect","jdbc:jtds:sqlserver://");
    
    
    private String label;

    private String connectionDriver;

    private String dialect;

    private String jdbcParam;
    
    DataSourceEnum(String label, String driver, String dialect,String jdbcParam) {
        this.label = label;
        this.connectionDriver = driver;
        this.dialect = dialect;		
        this.jdbcParam = jdbcParam;
    }

    public String getJdbcParam() {
		return jdbcParam;
	}

	public void setJdbcParam(String jdbcParam) {
		this.jdbcParam = jdbcParam;
	}

	public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

	public String getConnectionDriver() {
		return connectionDriver;
	}

	public void setConnectionDriver(String connectionDriver) {
		this.connectionDriver = connectionDriver;
	}

	public String getDialect() {
		return dialect;
	}

	public void setDialect(String dialect) {
		this.dialect = dialect;
	}



}
