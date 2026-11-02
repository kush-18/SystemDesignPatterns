package main.systemdesignpattern.abstractfactorypattern.connection;

public class PostgresSqlConnection implements Connection{
    @Override
    public void connect() {
        System.out.println("Connected DB Using PostgresSQL Connection");
    }
    @Override
    public void disconnect() {
        System.out.println("Disconnected DB Using PostgresSQL Connection");
    }
}
