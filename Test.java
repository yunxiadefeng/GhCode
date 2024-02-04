public class Test {
    private static final int APPLE_PRICE = 8;
    private static final int STRAWBERRY_PRICE = 13;
    private static final int MANGO_PRICE = 20;
    private static final double STRAWBERRY_DISCOUNT = 0.8;
    private static final int PROMOTION_THRESHOLD = 100;
    private static final int PROMOTION_DISCOUNT = 10;

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        // 测试数据
        int appleAmountA = 3;
        int strawberryAmountA = 5;
        int appleAmountB = 4;
        int strawberryAmountB = 2;
        int mangoAmountB = 1;
        int appleAmountC = 6;
        int strawberryAmountC = 4;
        int mangoAmountC = 2;
        int appleAmountD = 8;
        int strawberryAmountD = 7;
        int mangoAmountD = 5;

        // 顾客 A 购买商品总价
        double totalPriceA = calculateTotalPrice(appleAmountA, strawberryAmountA);
        System.out.println("顾客 A 购买商品总价：" + totalPriceA);

        // 顾客 B 购买商品总价
        double totalPriceB = calculateTotalPrice(appleAmountB, strawberryAmountB, mangoAmountB);
        System.out.println("顾客 B 购买商品总价：" + totalPriceB);

        // 顾客 C 购买商品总价
        double totalPriceC = calculateTotalPriceWithDiscount(appleAmountC, strawberryAmountC, mangoAmountC);
        System.out.println("顾客 C 购买商品总价：" + totalPriceC);

        // 顾客 D 购买商品总价
        double totalPriceD = calculateTotalPriceWithPromotion(appleAmountD, strawberryAmountD, mangoAmountD);
        System.out.println("顾客 D 购买商品总价：" + totalPriceD);
    }

    /**
     * 计算顾客购买商品的总价
     *
     * @param appleAmount      苹果购买重量（单位：斤）
     * @param strawberryAmount 草莓购买重量（单位：斤）
     * @return 商品总价
     */
    public static double calculateTotalPrice(int appleAmount, int strawberryAmount) {
        double totalPrice = appleAmount * APPLE_PRICE + strawberryAmount * STRAWBERRY_PRICE;
        return totalPrice;
    }

    /**
     * 计算顾客购买商品的总价
     *
     * @param appleAmount      苹果购买重量（单位：斤）
     * @param strawberryAmount 草莓购买重量（单位：斤）
     * @param mangoAmount      芒果购买重量（单位：斤）
     * @return 商品总价
     */
    public static double calculateTotalPrice(int appleAmount, int strawberryAmount, int mangoAmount) {
        double totalPrice = appleAmount * APPLE_PRICE + strawberryAmount * STRAWBERRY_PRICE + mangoAmount * MANGO_PRICE;
        return totalPrice;
    }

    /**
     * 计算顾客购买商品的总价（草莓打折）
     *
     * @param appleAmount      苹果购买重量（单位：斤）
     * @param strawberryAmount 草莓购买重量（单位：斤）
     * @param mangoAmount      芒果购买重量（单位：斤）
     * @return 商品总价
     */
    public static double calculateTotalPriceWithDiscount(int appleAmount, int strawberryAmount, int mangoAmount) {
        double totalPrice = appleAmount * APPLE_PRICE + strawberryAmount * STRAWBERRY_PRICE * STRAWBERRY_DISCOUNT + mangoAmount * MANGO_PRICE;
        return totalPrice;
    }

    /**
     * 计算顾客购买商品的总价（满减促销）
     *
     * @param appleAmount      苹果购买重量（单位：斤）
     * @param strawberryAmount 草莓购买重量（单位：斤）
     * @param mangoAmount      芒果购买重量（单位：斤）
     * @return 商品总价
     */
    public static double calculateTotalPriceWithPromotion(int appleAmount, int strawberryAmount, int mangoAmount) {
        double totalPrice = calculateTotalPrice(appleAmount, strawberryAmount, mangoAmount);
        if (totalPrice >= PROMOTION_THRESHOLD) {
            totalPrice -= PROMOTION_DISCOUNT;
        }
        return totalPrice;
    }
}