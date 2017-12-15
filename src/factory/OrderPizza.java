package factory;

public class OrderPizza {
    public static void main(String[] args) {
        // ��Ҫ��GreekPizza
        Factory factory = new GreekPizzaFactory();
        Pizza pizza = factory.createPizza();
        pizza.prepare();
        pizza.cut();
        pizza.bake();
        pizza.box();
        // ��Ҫ��CheesePizza
        Factory factory2 = new CheesePizzaFactory();
        Pizza cheesePizza = factory2.createPizza();
        cheesePizza.prepare();
        cheesePizza.bake();
        cheesePizza.cut();
        cheesePizza.box();
    }
}
