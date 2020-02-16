package by.issoft.demo;

public class OrderService {

    private OrderValidator orderValidator;

    public void CreateOrder(Order order) {

        if(orderValidator.isValid(order)) {
            System.out.println("Order" + order + " is created");
        } else {
            System.out.println("Order" + order + " is not valid");
        }
    }

}
