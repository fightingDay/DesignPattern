package strategy.context2;

/**
 * ������Ա�ۿ���
 * 
 * @author Administrator
 *
 */
public class PrimaryMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("���ڳ�����Աû���ۿ�");
        return booksPrice;
    }

}
