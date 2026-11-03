package main.systemdesignpattern.observerpattern.observer;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FileLogger implements Observer{
    @Override
    public void notify(String symbol, double price) {
        try(FileWriter fileWriter = new FileWriter("observer.txt",true)) {
            fileWriter.write((LocalDateTime.now() + " | " +  symbol + " price: " + price));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
