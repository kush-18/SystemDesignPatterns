package main.systemdesignpattern.abstractfactorypattern;

import main.systemdesignpattern.abstractfactorypattern.DataBaseFactory.DataBaseFactory;
import main.systemdesignpattern.abstractfactorypattern.QueryExecutor.QueryExecutor;
import main.systemdesignpattern.abstractfactorypattern.connection.Connection;

public class DataBaseClient {

    private final Connection connection;
    private final QueryExecutor queryExecutor;

    public DataBaseClient(DataBaseFactory factory) {
        connection = factory.createConnection();
        queryExecutor = factory.createQueryExecutor();
    }

    public void interactWithDatabase(String query) {
        connection.connect();
        queryExecutor.execute(query);
        connection.disconnect();
    }

}
