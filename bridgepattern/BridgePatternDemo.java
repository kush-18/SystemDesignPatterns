package main.systemdesignpattern.bridgepattern;

public class BridgePatternDemo {

    static void main(String[] args) {

        Payment creditCardPayment = new CreditCardPayment(new PayPalPaymentGateway());
        creditCardPayment.processPayment(500);

        Payment upiPayment = new CreditCardPayment(new SbiPaymentGateway());
        upiPayment.processPayment(5000);




    }


}
