/*
import com.hky.prod.problem.PaymentRequest;

public String processPayment(PaymentRequest request) {

    if (request == null) {
        return "Invalid Request";
    }

    if (request.getAmount() <= 0) {
        return "Invalid Amount";
    }

    if (request.getPaymentMode().equals("CARD")) {

        if (request.getCardNumber() == null) {
            return "Card Number Required";
        }

        if (request.getCvv() == null) {
            return "CVV Required";
        }

        return "Card Payment Processed";

    } else if (request.getPaymentMode().equals("UPI")) {

        if (request.getUpiId() == null) {
            return "UPI ID Required";
        }

        return "UPI Payment Processed";

    } else if (request.getPaymentMode().equals("NETBANKING")) {

        if (request.getBankAccount() == null) {
            return "Bank Account Required";
        }

        return "Net Banking Payment Processed";

    }

    return "Invalid Payment Mode";
}

public void main() {
}
*/
