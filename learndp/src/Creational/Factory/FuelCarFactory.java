package Creational.Factory;

public class FuelCarFactory implements AbstractCarFactory {
    @Override
    public Car getCar(String carname) {
        if(carname.equals("Ford")){
            return new FordFuel();
        }
        return null;
    }
}
