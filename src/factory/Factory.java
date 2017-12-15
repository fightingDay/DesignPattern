package factory;

/**
 * 抽象工厂角色：担任这个角色的是工厂方法模式的核心，它是与应用程序无关的。任何在模式中创建对象的工厂类必须实现这个接口。
 */
public interface Factory {
    // 创建披萨
    public Pizza createPizza();
}
