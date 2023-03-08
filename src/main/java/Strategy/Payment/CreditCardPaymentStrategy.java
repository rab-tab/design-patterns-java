package Strategy.Payment;

public class CreditCardPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(String price) {
        System.out.println("Paying via credit card");
    }
}
