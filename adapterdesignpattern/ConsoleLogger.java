package main.systemdesignpattern.adapterdesignpattern;

public class ConsoleLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Logging the message: " + message);
    }
}
