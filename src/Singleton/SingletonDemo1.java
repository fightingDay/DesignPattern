package Singleton;

/**
 * ����ʽ����ģʽ ���̰߳�ȫ ��֧����ʱ���� ����Ч�ʸߡ�
 * 
 * @author Administrator
 *
 */
public class SingletonDemo1 {

	// ��ʼ����ʱ���������ض���
	// ��Ȼ�̰߳�ȫ����jvm����������й�
	private static SingletonDemo1 instance = new SingletonDemo1();

	// ������˽�л������಻֧��ʵ����
	private SingletonDemo1() {

	}

	// ͨ�����þ�̬������ȡʵ��
	public static SingletonDemo1 getInstance() {
		return instance;
	}
}
