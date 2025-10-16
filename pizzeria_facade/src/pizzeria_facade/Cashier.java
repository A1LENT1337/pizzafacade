package pizzeria_facade;

public class Cashier implements IEmployee {
    private String name;
    private String action;

    public Cashier() {
        this.name = "Cashier";
        this.action = "Taking orders and handling payments";
    }

    @Override
    public void doWork() {
        System.out.println(name + ": " + action);
    }
}
