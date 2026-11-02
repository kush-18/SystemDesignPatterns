package main.systemdesignpattern.singleton;

public class Logger {
    private String name;
    private static Logger logger;

    private Logger(String name) {

        try{
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.name = name;
    }
    public static Logger getInstance(String name) {
        if(logger != null) return logger;
        synchronized (Logger.class) {
            return new Logger(name);
        }
    }
    public void log(String logMessage) {
        System.out.println(name + " " + logMessage);
    }
}
