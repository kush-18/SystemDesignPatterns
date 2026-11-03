package main.systemdesignpattern.observerpattern.subject;

import main.systemdesignpattern.observerpattern.observer.Observer;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class State implements Subject{

    private final String symbol;
    private double price;

    private final List<Observer> observers= new CopyOnWriteArrayList<>();

    private final Random  random = new Random();

    public State(String symbol, double intialPrice) {
        this.symbol = symbol;
        this.price = intialPrice;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.notify(symbol,price);
        }
    }

    public void startPriceFeed() {
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

        scheduler.scheduleAtFixedRate(() -> {
            double change = (random.nextDouble() - 0.5) * 10;
            price = Math.round((price + change) * 100.0) / 100.0;
            notifyObservers();
        },0,5, TimeUnit.SECONDS);

    }

}
