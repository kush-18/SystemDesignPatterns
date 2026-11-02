package main.systemdesignpattern.facadepattern;

public class OrderFacade {
    public final RestaurantService restaurantService;
    private final PaymentService paymentService;

    private final DeliveryService deliveryService;

    private final NotificationService notificationService;

    public OrderFacade() {
        this.restaurantService = new RestaurantService();
        this.paymentService = new PaymentService();
        this.deliveryService = new DeliveryService();
        this.notificationService = new NotificationService();
    }

    public void placeOrder(String food,double amount) {
        if(!restaurantService.checkAvailability(food)) {
            System.out.println("Food is unavailable");
            return;
        }
        restaurantService.prepareFood(food);
        if(!paymentService.makePayment(amount)) {
            System.out.println("Not able to process the payment now");
            return;
        }
        deliveryService.assignDeliveryPattern();
        notificationService.sendNotification("Order Placed");

    }

}
