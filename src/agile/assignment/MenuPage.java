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
public class MenuPage {
    String productID;
    String productName;
    double productPrice;
    String productStatus;
    String OrderID;      

    public MenuPage() {
    }

    public MenuPage(String productID, String productName, double productPrice, String productStatus) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStatus = productStatus;
    }    
    
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }
}
