package factory;

/**
 * ���幤����ɫ�����������ɫ����ʵ���˳��󹤳��ӿڵľ���Java�࣬���幤����ɫ������Ӧ��������ص��߼��������ܵ�Ӧ�ó���ĵ����Դ�����Ʒ����
 */
public class GreekPizzaFactory implements Factory {
    
    @Override
    public Pizza createPizza() {
        return new GreekPizza();
    }
    
}
