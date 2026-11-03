package main.systemdesignpattern.bridgepattern;

public class SbiPaymentGateway implements Gateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("SBI Payment Gateway");
        System.out.println("Processing Payment of amount: " + amount);
    }
}
