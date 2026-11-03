package main.systemdesignpattern.bridgepattern;

public class UpiPayment extends Payment{

    public UpiPayment(Gateway gateway) {
        super(gateway);
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Paying through the UPI");
        gateway.processPayment(amount);
    }
}
