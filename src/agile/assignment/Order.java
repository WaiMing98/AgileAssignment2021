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
public class Order {
    String OrderID;
    String date;
    String time;
    String prodID;

    public Order() {
    }

    public Order(String OrderID, String date, String time) {
        this.OrderID = OrderID;
        this.date = date;
        this.time = time;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getProdID() {
        return prodID;
    }

    public void setProdID(String prodID) {
        this.prodID = prodID;
    }
    
    
    
}
