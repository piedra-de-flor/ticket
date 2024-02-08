package ticket;

public class AmountDiscountCoupon extends Coupon {
    private Long discountAmount;

    @Override
    public Long getDiscount() {
        return discountAmount;
    }

    @Override
    public Long discount(Long amount) {
        return amount - discountAmount;
    }
}
