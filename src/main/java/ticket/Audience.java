package ticket;

import java.util.List;

public class Audience {

    private Storage storage;

    public Audience(Storage storage) {
        this.storage = storage;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Long buy(Ticket ticket) {
        if (storage.hasCoupon()) {
            Long totalFee = storage.getCoupon().discount(ticket.getFee());
            storage.minusAmount(totalFee, choosePayment(1));
            storage.setTicket(ticket);
            return totalFee;
        } else {
            storage.minusAmount(ticket.getFee(), choosePayment(2));
            storage.setTicket(ticket);
            return ticket.getFee();
        }
    }

    private Payment choosePayment(int payment) {
        List<Payment> payments = storage.getPayment();
        return payments.get(payment);
    }

    private void takeTicket(Ticket ticket) {
        storage.setTicket(ticket);
    }
}


