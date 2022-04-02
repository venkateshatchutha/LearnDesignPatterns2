package Structural.Decorator;

public class plainbeverage implements beverage{


    @Override
    public int getCost() {
        System.out.println(a);
        return 3;
    }

    @Override
    public String getDescription() {
        return "PlainBeverage ";

    }
}
