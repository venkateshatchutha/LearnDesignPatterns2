package Creational.Factory;

public class FactoryCarProducer {
    public static AbstractCarFactory getFactory(String name){
        if (name.equals("Electric")){
            return new ElectricCarFactory();
        }
        else if (name.equals("Fuel")){
            return new FuelCarFactory();
        }
        return null;
    }
}
