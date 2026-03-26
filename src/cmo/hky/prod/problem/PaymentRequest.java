package cmo.hky.prod.problem;

import java.math.BigDecimal;


public class PaymentRequest {


    private Long id;


    private Integer amount;


    private String paymentMode;


    private String cardNumber;


    private String cvv;


    private String upiId;


    private String bankAccount;

    // Default Constructor
    public PaymentRequest() {
    }

    // Parameterized Constructor
    public PaymentRequest(Integer amount, String paymentMode,
                          String cardNumber, String cvv,
                          String upiId, String bankAccount) {

        this.amount = amount;
        this.paymentMode = paymentMode;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.upiId = upiId;
        this.bankAccount = bankAccount;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
}