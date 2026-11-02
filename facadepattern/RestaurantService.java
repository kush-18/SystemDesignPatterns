package main.systemdesignpattern.facadepattern;

public class RestaurantService {

    public boolean checkAvailability(String food) {
        System.out.println("Checking Restaurant Availability....");
        return true;
    }
    public void prepareFood(String food) {
        System.out.println("Preparing your food " + food);
    }
}
