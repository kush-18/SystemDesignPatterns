package main.systemdesignpattern.adapterdesignpattern;

public class Main {
    static void main(String[] args) {

        FileLoggerAdapter fileLoggerAdapter = new FileLoggerAdapter(new FileLogger());
        fileLoggerAdapter.log("First Log");

        ConsoleLogger consoleLogger = new ConsoleLogger();
        consoleLogger.log("Second Log");

    }
}
