package strategy.context2;

/**
 * �м���Ա�ۿ���
 * 
 * @author Administrator
 *
 */
public class IntermediateMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("�����м���Ա���ۿ�Ϊ10%");
        return booksPrice * 0.9;
    }

}
