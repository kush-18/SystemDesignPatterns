package main.systemdesignpattern.abstractfactorypattern.DataBaseFactory;

import main.systemdesignpattern.abstractfactorypattern.QueryExecutor.QueryExecutor;
import main.systemdesignpattern.abstractfactorypattern.connection.Connection;

public interface DataBaseFactory {
    Connection createConnection();
    QueryExecutor createQueryExecutor();
}
