package Singleton;

/**
 * 静态内部类实现单例模式 线程安全 调用效率高 延时加载
 * 
 * @author Administrator
 *
 */
public class SingletonDemo4 {

	// 私有静态内部类
	private static class SingletonHolder {
		// 常量
		private static final SingletonDemo4 INSTANCE = new SingletonDemo4();
	}

	private SingletonDemo4() {
	}

	// 类加载时，instance不一定被初始化，因为SingletonHolder没有被主动使用，
	// 只能通过显示调用getInstance方法时，才会显示装在SingletonHolder类，从而实例化instance
	public static final SingletonDemo4 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
