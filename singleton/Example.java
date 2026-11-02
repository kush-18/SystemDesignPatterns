package main.systemdesignpattern.singleton;

public class Example {
    public static void singleThreadedExample() {
        Logger logger1 = Logger.getInstance("Foo");
        Logger logger2 = Logger.getInstance("Bar");

        logger1.log("Logging using 1st Logger");
        logger2.log("Logging using 2st Logger");
    }


    public static void multiThreadedExample() {
        Thread threada = new Thread(new Runnable() {
            @Override
            public void run() {
                Logger logger = Logger.getInstance("a");
                logger.log("froma");
            }
        });


        Thread threadb = new Thread(new Runnable() {
            @Override
            public void run() {
                Logger logger = Logger.getInstance("b");
                logger.log("fromb");
            }
        });


        threada.start();
        threadb.start();
    }
}

