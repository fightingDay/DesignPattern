package strategy.context2;

/**
 * ¿Í»§¶Ë
 * 
 * @author Administrator
 *
 */
public class Client {
    public static void main(String[] args) {
        MemberStrategy memberStrategy = new AdvanceMemberStrategy();
        MemberStrategy memberStrategy2 = new PrimaryMemberStrategy();
        Price price = new Price(memberStrategy2);
        double quotePrice = price.quote(200);
        System.out.println(quotePrice);
    }
}
