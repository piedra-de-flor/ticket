package ticket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Storage {
    private List<Payment> payments;
    private Coupon coupon;
    private Ticket ticket;

    public Storage(Payment ... payments) {
        this(null, payments);
    }

    public Storage(Coupon coupon, Payment ... payments) {
        this.payments = new ArrayList<>(Arrays.asList(payments));
        this.coupon = coupon;
    }

    public boolean hasCoupon() {
        return coupon != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void plusAmount(Long amount, Payment payment) {
        payment.plusAmount(amount);
    }

    public void minusAmount(Long amount, Payment payment) {
        payment.minusAmount(amount);
    }

    public List<Payment> getPayment() {
        return payments;
    }

    public void setPayment(Payment ... payments) {
        this.payments = Arrays.asList(payments);
    }

    public Coupon getCoupon() {
        return coupon;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
