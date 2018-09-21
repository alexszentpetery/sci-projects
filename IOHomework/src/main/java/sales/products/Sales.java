package sales.products;

import java.util.HashMap;

public class Sales {
    private int orderNumber;
    private String productName;
    private int productPrice;
    private String clientName;

    public Sales(int orderNumber, String productName, int price, String clientName) {
        this.orderNumber = orderNumber;
        this.productName = productName;
        this.productPrice = price;
        this.clientName = clientName;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "orderNumber=" + orderNumber +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", clientName='" + clientName + '\'' +
                '}';
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }


}
