package Strategy.Payment;

public class DebitCardPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(String price) {
        System.out.println("Paying via debit card");
    }
}
