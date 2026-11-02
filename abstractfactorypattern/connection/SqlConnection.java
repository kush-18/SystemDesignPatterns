package main.systemdesignpattern.abstractfactorypattern.connection;

public class SqlConnection implements Connection {
    @Override
    public void connect() {
        System.out.println("Connected to SQL Database");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected to SQL Database");
    }
}
