package strategy.context2;

/**
 * 价格类
 * 
 * @author Administrator
 *
 */
public class Price {
    // 持一个具体的策略对象
    private MemberStrategy memberStrategy;

    /**
     * 构造函数，传入一个具体的策略对象
     * 
     * @param memberStrategy
     */
    public Price(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }

    /**
     * 计算图书的价格
     * 
     * @param booksPrice
     *            图书的原价
     * @return 计算打折后的价格
     */
    public double quote(double booksPrice) {
        return this.memberStrategy.calcPrice(booksPrice);
    }
}
