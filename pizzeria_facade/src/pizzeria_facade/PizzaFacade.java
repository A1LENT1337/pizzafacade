package pizzeria_facade;

public class PizzaFacade {
    private Chef chef;
    private Cashier cashier;
    private DeliveryGuy deliveryGuy;

    private String name;
    private String startMessage;
    private String endMessage;

    public PizzaFacade() {
        this.chef = new Chef();
        this.cashier = new Cashier();
        this.deliveryGuy = new DeliveryGuy();
        this.name = "PizzeriaFacade";
        this.startMessage = "Starting pizza order process";
        this.endMessage = "Pizza successfully delivered!";
    }

    public void processOrder() {
        System.out.println(name + ": " + startMessage);
        cashier.doWork();
        chef.doWork();
        deliveryGuy.doWork();
        System.out.println(name + ": " + endMessage);
    }
}
