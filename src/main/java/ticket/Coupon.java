package ticket;

import java.time.LocalDateTime;

public abstract class Coupon {
    private LocalDateTime when;

    public LocalDateTime getWhen() {
        return when;
    }

    public abstract Long getDiscount();

    public abstract Long discount(Long amount);
}
