package Singleton;

/**
 * ��̬�ڲ���ʵ�ֵ���ģʽ �̰߳�ȫ ����Ч�ʸ� ��ʱ����
 * 
 * @author Administrator
 *
 */
public class SingletonDemo4 {

	// ˽�о�̬�ڲ���
	private static class SingletonHolder {
		// ����
		private static final SingletonDemo4 INSTANCE = new SingletonDemo4();
	}

	private SingletonDemo4() {
	}

	// �����ʱ��instance��һ������ʼ������ΪSingletonHolderû�б�����ʹ�ã�
	// ֻ��ͨ����ʾ����getInstance����ʱ���Ż���ʾװ��SingletonHolder�࣬�Ӷ�ʵ����instance
	public static final SingletonDemo4 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
