package factory;

/**
 * 抽象产品角色：工厂方法模式所创建的对象的超类型，也就是产品对象的共同父类或共同拥有的接口。
 */
public abstract class Pizza {
    
    public abstract void prepare();
    
    public abstract void bake();
    
    public abstract void cut();
    
    public abstract void box();
}
