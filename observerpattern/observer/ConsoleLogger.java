package main.systemdesignpattern.observerpattern.observer;

import java.time.LocalDateTime;

public class ConsoleLogger implements Observer{
    @Override
    public void notify(String symbol, double price) {
        System.out.println(LocalDateTime.now() + " | " +  symbol + " price: " + price);
    }
}
