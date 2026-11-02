package main.systemdesignpattern.abstractfactorypattern.DataBaseFactory;

import main.systemdesignpattern.abstractfactorypattern.QueryExecutor.QueryExecutor;
import main.systemdesignpattern.abstractfactorypattern.QueryExecutor.SQLQueryExecutor;
import main.systemdesignpattern.abstractfactorypattern.connection.Connection;
import main.systemdesignpattern.abstractfactorypattern.connection.SqlConnection;

public class MySQLDataBaseFactory implements DataBaseFactory {
    @Override
    public Connection createConnection() {
        return new SqlConnection();
    }
    @Override
    public QueryExecutor createQueryExecutor() {
        return new SQLQueryExecutor();
    }
}
