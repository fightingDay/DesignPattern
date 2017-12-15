package factory;

/**
 * 
 * 具体产品角色：这个角色实现了抽象产品角色所申明的接口。工厂方法模式所创建的每一个对象都是某个具体产品角色的实例
 *
 */
public class CheesePizza extends Pizza {
    
    @Override
    public void prepare() {
        System.out.println("准备CheesePizza~~");
    }
    
    @Override
    public void bake() {
        System.out.println("正在考CheesePizza~~");
    }
    
    @Override
    public void cut() {
        System.out.println("正在切CheesePizza~~");
    }
    
    @Override
    public void box() {
        System.out.println("正在打包CheesePizza~~");
    }
    
}
