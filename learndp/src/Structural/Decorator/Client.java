package Structural.Decorator;

public class Client {
    public static void main(String[] args) {
        beverage b =new sugar(new sugar(new milk(new plainbeverage())));
        System.out.println(b.getDescription());
        System.out.println("total cost "+b.getCost());
    }

}
