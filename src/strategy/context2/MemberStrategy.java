package strategy.context2;

/**
 * 抽象折扣类
 * 
 * @author Administrator
 *
 */
public interface MemberStrategy {

    /**
     * 计算图书价格
     * 
     * @param booksPrice
     *            图书的原价
     * @return 计算打折后图书价格
     */
    public double calcPrice(double booksPrice);
}
