package strategy.context2;

/**
 * �����ۿ���
 * 
 * @author Administrator
 *
 */
public interface MemberStrategy {

    /**
     * ����ͼ��۸�
     * 
     * @param booksPrice
     *            ͼ���ԭ��
     * @return ������ۺ�ͼ��۸�
     */
    public double calcPrice(double booksPrice);
}
