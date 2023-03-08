package Strategy.Payment;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {


        System.out.println("PLease enter payment type ");
        Scanner scanner = new Scanner(System.in);
        String paymentType = scanner.next();
        PaymentType type = PaymentType.valueOf(paymentType);


        PaymentContext paymentContext = new PaymentContext();
        if (PaymentType.CREDIT == type) {
            paymentContext.setPaymentStrategy(new CreditCardPaymentStrategy());
        } else if (PaymentType.DEBIT == type) {
            paymentContext.setPaymentStrategy(new DebitCardPaymentStrategy());
        }

        paymentContext.pay("1000");


    }
}
