package coffee.order;

public class Order {

    private int orderNumber;
    private String clientName;

    public Order(String clientName, int orderNumber) {
        this.clientName = clientName;
        this.orderNumber = orderNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getClientName() {
        return clientName;
    }
}