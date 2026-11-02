package main.systemdesignpattern.builder;

public class Car {
    private final int numberOfSeats;
    private final Engine engine;

    private Car(Builder builder) {
        this.numberOfSeats = builder.numberOfSeats;
        this.engine = builder.engine;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Engine getEngine() {
        return engine;
    }

    public static class Builder{
        private int numberOfSeats;
        private Engine engine;

        public static Builder newInstance() {
            return new Builder();
        }

        public  Builder setNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
            return this;
        }

        public Builder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public Car build() {
            return new Car(this);
        }


    }
}
