package main.systemdesignpattern.bridgepattern;

public class PayPalPaymentGateway implements Gateway{
    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal Payment Gateway");
        System.out.println("Processing Payment of amount: " + amount);
    }
}
