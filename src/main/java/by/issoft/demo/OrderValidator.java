package by.issoft.demo;

public class OrderValidator {

    private int minOrderNumber = 1;

    public boolean isValid(Order order) {
        if(order.getOrderNumber() < minOrderNumber) {
            return false;
        }
        return true;
    }

    public void setMinOrderNumber(int minOrderNumber) {
        this.minOrderNumber = minOrderNumber;
    }

}
