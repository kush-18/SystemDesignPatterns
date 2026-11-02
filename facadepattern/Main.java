package main.systemdesignpattern.facadepattern;

public class Main {

    public static void main(String[] args) {

        OrderFacade orderFacade = new OrderFacade();

        orderFacade.placeOrder("Pizza", 499);
    }
}