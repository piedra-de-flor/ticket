package ticket;

public class PercentDiscountCoupon extends Coupon {
    private final int DIVISION_FOR_DISCOUNT_RATE_PERCENT = 100;
    private Long discountRate;

    @Override
    public Long getDiscount() {
        return discountRate;
    }

    @Override
    public Long discount(Long amount) {
        return amount * discountRate / DIVISION_FOR_DISCOUNT_RATE_PERCENT;
    }
}
