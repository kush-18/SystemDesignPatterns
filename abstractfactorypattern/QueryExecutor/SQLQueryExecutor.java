package main.systemdesignpattern.abstractfactorypattern.QueryExecutor;

public class SQLQueryExecutor implements QueryExecutor{
    @Override
    public void execute(String query) {
        System.out.println("Executing SQL Query: " + query);
    }
}
