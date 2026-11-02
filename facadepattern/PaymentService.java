package main.systemdesignpattern.facadepattern;

public class PaymentService {
    public boolean makePayment(double amount) {
        System.out.println("Processing Payment of amount: " + amount);
        return true;
    }


}
