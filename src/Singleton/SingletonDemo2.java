package Singleton;

/**
 * 懒汉式单例模式(同步) 【线程安全 延时加载 调用效率低】
 * 
 * @author Administrator
 *
 */
public class SingletonDemo2 {
	// 类初始化时，先不创建实例
	private static SingletonDemo2 instance;

	// 构造方法私有化，该类不能实例
	private SingletonDemo2() {
	}

	// 同步静态方法，等用到类的时候再初始化对象
	public static synchronized SingletonDemo2 getInstance() {
		if (instance == null) {
			instance = new SingletonDemo2();
		}
		return instance;
	}
}
