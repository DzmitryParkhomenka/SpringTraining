package by.issoft.demo;

public class App {

    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        orderService.CreateOrder(new Order(123));
    }
}
