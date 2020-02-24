package by.issoft.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app.xml");

        OrderService orderService1 = applicationContext.getBean(OrderService.class);

        OrderService orderService2 = applicationContext.getBean(OrderService.class);

        orderService.createOrder(new Order(124));
    }
}
