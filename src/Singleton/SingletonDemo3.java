package Singleton;

/**
 * 懒汉式单例模式（不同步） 不支持多线程
 * 
 * @author Administrator
 *
 */
public class SingletonDemo3 {

	private static SingletonDemo3 instance;

	private SingletonDemo3() {

	}

	// 多线程时，线程A调用getInstance方法时，线程挂起，线程B调用getInstance方法创建实例
	// ，线程A恢复时，又创建了一个实例，这与单例模式原则相违背
	public static SingletonDemo3 getInstance() {
		if (instance == null) {
			instance = new SingletonDemo3();
		}
		return instance;
	}
}
