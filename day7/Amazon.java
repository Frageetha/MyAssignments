package week4.day7;

public class Amazon extends CanaraBank {
    
    public void cashOnDelivery() {
        System.out.println("Processing cash on delivery payment");
        recordPaymentDetails("Cash on delivery", 500.00);
    }

   
    public void upiPayment() {
        System.out.println("Processing UPI Payment");
        recordPaymentDetails("UPI Payment", 1500);
    }

   
    public void cardPayments() {
        System.out.println("Processing card payment");
        recordPaymentDetails("Card payment", 2000);
    }

   
    public void internetBanking() {
        System.out.println("Processing Internet Banking payment");
        recordPaymentDetails("Internet Banking", 2000.00);
    }

    
    public void recordPaymentDetails(String paymentType, double amount) {
        System.out.println("Recording payment details");
        System.out.println("Payment Type: " + paymentType);
        System.out.println("Amount: " + amount);
        System.out.println("Payment recorded successfully");
    }

    
    public static void main(String[] args) {
        Amazon am = new Amazon();
        am.cashOnDelivery();
        am.upiPayment();
        am.cardPayments();
        am.internetBanking();
    }
}
