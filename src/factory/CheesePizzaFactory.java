package factory;

/**
 * 具体工厂角色：担任这个角色的是实现了抽象工厂接口的具体Java类，具体工厂角色含有与应用密切相关的逻辑，并且受到应用程序的调用以创建产品对象。
 */
public class CheesePizzaFactory implements Factory {
    
    @Override
    public Pizza createPizza() {
        return new CheesePizza();
    }
    
}
