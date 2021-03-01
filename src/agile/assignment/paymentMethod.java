/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agile.assignment;

/**
 *
 * @author User
 */
public class paymentMethod {
    String paymentID;
    String paymentMethod;
    String cardNumber;
    String ExpiredDate;
    String CVV;
    String amount;

    public paymentMethod() {
    }

    public paymentMethod(String paymentID, String paymentMethod, String cardNumber, String ExpiredDate, String CVV, String amount) {
        this.paymentID = paymentID;
        this.paymentMethod = paymentMethod;
        this.cardNumber = cardNumber;
        this.ExpiredDate = ExpiredDate;
        this.CVV = CVV;
        this.amount = amount;
    }
    
    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }


    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiredDate() {
        return ExpiredDate;
    }

    public void setExpiredDate(String ExpiredDate) {
        this.ExpiredDate = ExpiredDate;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }
}
