package by.issoft.demo;

public class App {

    public static void main(String[] args) {

        OrderValidator orderValidator = new OrderValidator();
        orderValidator.setMinOrderNumber(122);

        OrderService orderService = new OrderService(orderValidator);
        orderService.createOrder(new Order(123));
    }
}
