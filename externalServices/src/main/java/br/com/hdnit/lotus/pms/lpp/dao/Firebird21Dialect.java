package br.com.hdnit.lotus.pms.lpp.dao;

import org.hibernate.dialect.FirebirdDialect;

public class Firebird21Dialect extends FirebirdDialect {

    @Override
    public boolean dropTemporaryTableAfterUse() {
        return true;
    }

    @Override

    public String getCreateTemporaryTablePostfix() {
     return " ON COMMIT PRESERVE ROWS";
    }

    @Override

    public String getCreateTemporaryTableString() {
        return "CREATE GLOBAL TEMPORARY TABLE ";
    }

    @Override

    public boolean supportsTemporaryTables() {
        return true;
    }

}