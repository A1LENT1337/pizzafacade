package pizzeria_facade;

public class DeliveryGuy implements IEmployee {
    private String name;
    private String action;

    public DeliveryGuy() {
        this.name = "Delivery Guy";
        this.action = "Delivering pizzas to customers";
    }

    @Override
    public void doWork() {
        System.out.println(name + ": " + action);
    }
}
