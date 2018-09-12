package Singleton;

/**
 * ����ʽ����ģʽ����ͬ���� ��֧�ֶ��߳�
 * 
 * @author Administrator
 *
 */
public class SingletonDemo3 {

	private static SingletonDemo3 instance;

	private SingletonDemo3() {

	}

	// ���߳�ʱ���߳�A����getInstance����ʱ���̹߳����߳�B����getInstance��������ʵ��
	// ���߳�A�ָ�ʱ���ִ�����һ��ʵ�������뵥��ģʽԭ����Υ��
	public static SingletonDemo3 getInstance() {
		if (instance == null) {
			instance = new SingletonDemo3();
		}
		return instance;
	}
}
