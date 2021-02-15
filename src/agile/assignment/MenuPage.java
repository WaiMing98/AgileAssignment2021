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
    int productStock;
    String productStatus;
    String productDesc;    

    public MenuPage() {
    }

    public MenuPage(String productID, String productName, double productPrice, int productStock, String productStatus, String productDesc) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productStatus = productStatus;
        this.productDesc = productDesc;
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

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }    
}
