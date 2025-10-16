package pizzeria_facade;

public class Chef implements IEmployee {
    private String name;
    private String action;

    public Chef() {
        this.name = "Chef";
        this.action = "Cooking delicious pizzas";
    }

    @Override
    public void doWork() {
        System.out.println(name + ": " + action);
    }
}
