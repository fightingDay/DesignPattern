package factory;

/**
 * 
 * �����Ʒ��ɫ�������ɫʵ���˳����Ʒ��ɫ�������Ľӿڡ���������ģʽ��������ÿһ��������ĳ�������Ʒ��ɫ��ʵ��
 *
 */
public class CheesePizza extends Pizza {
    
    @Override
    public void prepare() {
        System.out.println("׼��CheesePizza~~");
    }
    
    @Override
    public void bake() {
        System.out.println("���ڿ�CheesePizza~~");
    }
    
    @Override
    public void cut() {
        System.out.println("������CheesePizza~~");
    }
    
    @Override
    public void box() {
        System.out.println("���ڴ��CheesePizza~~");
    }
    
}
