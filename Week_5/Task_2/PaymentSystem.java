interface Payment {

    void pay();

    void showPaymentDetails();
}

class UPIPayment implements Payment {

    String upiId;
    double amount;

    UPIPayment(String upiId, double amount) {
        this.upiId = upiId;
        this.amount = amount;
    }

    public void pay() {
        System.out.println("UPI Payment Successful");
    }

    public void showPaymentDetails() {
        System.out.println("UPI ID : " + upiId);
        System.out.println("Amount : " + amount);
    }
}

class CardPayment implements Payment {

    String cardNumber;
    double amount;

    CardPayment(String cardNumber, double amount) {
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    public void pay() {
        System.out.println("Card Payment Successful");
    }

    public void showPaymentDetails() {
        System.out.println("Card Number : " + cardNumber);
        System.out.println("Amount      : " + amount);
    }
}

public class PaymentSystem {

    public static void main(String[] args) {

        Payment upi = new UPIPayment("subhasri@upi", 1500);

        System.out.println("UPI PAYMENT");
        System.out.println("-----------");
        upi.showPaymentDetails();
        upi.pay();

        System.out.println();

        Payment card = new CardPayment("1234567890123456", 2500);

        System.out.println("CARD PAYMENT");
        System.out.println("------------");
        card.showPaymentDetails();
        card.pay();
    }
}