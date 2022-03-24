package Creational.Factory;

public class Client {
    public static void main(String[] args) {
        AbstractCarFactory factory = FactoryCarProducer.getFactory("Electric");
        factory.getCar("Ford").assemble();
    }
}
