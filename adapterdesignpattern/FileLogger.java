package main.systemdesignpattern.adapterdesignpattern;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger {
    public void writeToFile(String message) {

        try(FileWriter writer = new FileWriter("log.txt",true)) {
            writer.write("File Log: " + message + "\n");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
