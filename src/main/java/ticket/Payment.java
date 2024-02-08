package ticket;

public abstract class Payment {
    private Long amount;

    public abstract void plusAmount(Long amount);

    public abstract void minusAmount(Long amount);
}
