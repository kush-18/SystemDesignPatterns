package main.systemdesignpattern.observerpattern;

import main.systemdesignpattern.observerpattern.observer.ConsoleLogger;
import main.systemdesignpattern.observerpattern.observer.FileLogger;
import main.systemdesignpattern.observerpattern.observer.Observer;
import main.systemdesignpattern.observerpattern.subject.State;
import main.systemdesignpattern.observerpattern.subject.Subject;

import java.io.IOException;

public class ObserverPatternDemo {
    static void main(String[] args) {

        Observer consoleLogger = new ConsoleLogger();
        Observer fileLogger =new FileLogger();

        State tcsSubject = new State("TCS",3445);

        tcsSubject.addObserver(fileLogger);
        tcsSubject.addObserver(consoleLogger);

        tcsSubject.startPriceFeed();
        try {
            Thread.sleep(30000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
