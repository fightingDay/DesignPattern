package strategy.context2;

/**
 * �۸���
 * 
 * @author Administrator
 *
 */
public class Price {
    // ��һ������Ĳ��Զ���
    private MemberStrategy memberStrategy;

    /**
     * ���캯��������һ������Ĳ��Զ���
     * 
     * @param memberStrategy
     */
    public Price(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }

    /**
     * ����ͼ��ļ۸�
     * 
     * @param booksPrice
     *            ͼ���ԭ��
     * @return ������ۺ�ļ۸�
     */
    public double quote(double booksPrice) {
        return this.memberStrategy.calcPrice(booksPrice);
    }
}
