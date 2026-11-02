package main.systemdesignpattern.builder;

public class Example {
    static void main(String[] args) {
        Car car = Car.Builder.newInstance().setEngine(Engine.PETROL_ENGINE).setNumberOfSeats(5).build();


        System.out.println(car.getEngine() + " " + car.getNumberOfSeats());

    }
}
