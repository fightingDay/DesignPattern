package Singleton;

/**
 * 枚举单例模式 线程安全 不是延时加载 调用率高 可以避免反序列化，注解漏洞
 * 
 * @author Administrator
 *
 */
public enum SingletonDemo5 {

	INSTANCE;

	public void whateverMethod() {
	}
}
