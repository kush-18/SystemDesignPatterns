package main.systemdesignpattern.bridgepattern;

public class CreditCardPayment extends Payment{
    public CreditCardPayment(Gateway gateway) {
        super(gateway);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Payment through Credit Card");
        gateway.processPayment(amount);
    }
}
