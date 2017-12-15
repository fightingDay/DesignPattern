package factory;

/**
 * 具体产品角色：这个角色实现了抽象产品角色所申明的接口。工厂方法模式所创建的每一个对象都是某个具体产品角色的实例。
 */
public class GreekPizza extends Pizza {
    
    @Override
    public void prepare() {
        System.out.println("正在准备GreekPizza~~");
    }
    
    @Override
    public void bake() {
        System.out.println("正在烤GreekPizza~~");
    }
    
    @Override
    public void cut() {
        System.out.println("正在切GreekPizza~~");
    }
    
    @Override
    public void box() {
        System.out.println("正在打包GreekPizza~~");
    }
    
}
