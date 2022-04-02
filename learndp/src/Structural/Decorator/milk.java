package Structural.Decorator;

public class milk implements beverage{
    beverage beverage;
    public milk(beverage beverage){
        this.beverage =beverage;
    }

    @Override
    public int getCost() {
        return this.beverage.getCost()+3;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+"Milk ";
    }
}
