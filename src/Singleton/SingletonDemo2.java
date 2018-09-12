package Singleton;

/**
 * ����ʽ����ģʽ(ͬ��) ���̰߳�ȫ ��ʱ���� ����Ч�ʵ͡�
 * 
 * @author Administrator
 *
 */
public class SingletonDemo2 {
	// ���ʼ��ʱ���Ȳ�����ʵ��
	private static SingletonDemo2 instance;

	// ���췽��˽�л������಻��ʵ��
	private SingletonDemo2() {
	}

	// ͬ����̬���������õ����ʱ���ٳ�ʼ������
	public static synchronized SingletonDemo2 getInstance() {
		if (instance == null) {
			instance = new SingletonDemo2();
		}
		return instance;
	}
}
