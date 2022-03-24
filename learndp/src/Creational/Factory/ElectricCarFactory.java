package Creational.Factory;

public class ElectricCarFactory implements AbstractCarFactory {
    @Override
    public Car getCar(String carname) {
        if (carname.equals("Ford")){
            return new FordElectric();
        }else if(carname.equals("bmw")){
            return new bmwElectricCar();
        }
        return null;
    }
}
