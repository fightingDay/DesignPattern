package factory;

/**
 * �����Ʒ��ɫ�������ɫʵ���˳����Ʒ��ɫ�������Ľӿڡ���������ģʽ��������ÿһ��������ĳ�������Ʒ��ɫ��ʵ����
 */
public class GreekPizza extends Pizza {
    
    @Override
    public void prepare() {
        System.out.println("����׼��GreekPizza~~");
    }
    
    @Override
    public void bake() {
        System.out.println("���ڿ�GreekPizza~~");
    }
    
    @Override
    public void cut() {
        System.out.println("������GreekPizza~~");
    }
    
    @Override
    public void box() {
        System.out.println("���ڴ��GreekPizza~~");
    }
    
}
