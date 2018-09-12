package Singleton;

/**
 * 饿汉式单利模式 【线程安全 不支持延时加载 调用效率高】
 * 
 * @author Administrator
 *
 */
public class SingletonDemo1 {

	// 初始化类时，立即加载对象
	// 天然线程安全，与jvm虚拟机本身有关
	private static SingletonDemo1 instance = new SingletonDemo1();

	// 构造器私有化，该类不支持实例化
	private SingletonDemo1() {

	}

	// 通过调用静态方法获取实例
	public static SingletonDemo1 getInstance() {
		return instance;
	}
}
