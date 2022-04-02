package Structural.Decorator;

public class sugar implements beverage{
    beverage beverage;
    sugar(beverage beverage){
        this.beverage=beverage;
    }

    @Override
    public int getCost() {
        return this.beverage.getCost()+8;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+"Sugar ";
    }
}
