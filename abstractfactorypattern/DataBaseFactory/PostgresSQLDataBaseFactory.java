package main.systemdesignpattern.abstractfactorypattern.DataBaseFactory;

import main.systemdesignpattern.abstractfactorypattern.QueryExecutor.PostgresSQLQueryExecutor;
import main.systemdesignpattern.abstractfactorypattern.QueryExecutor.QueryExecutor;
import main.systemdesignpattern.abstractfactorypattern.connection.Connection;
import main.systemdesignpattern.abstractfactorypattern.connection.PostgresSqlConnection;

public class PostgresSQLDataBaseFactory implements DataBaseFactory {
    @Override
    public Connection createConnection() {
        return new PostgresSqlConnection();
    }

    @Override
    public QueryExecutor createQueryExecutor() {
        return new PostgresSQLQueryExecutor();
    }
}
