package Creational.Prototype;

public class circle implements shape1{
    @Override
    public shape1 clone() {
        return new circle();
    }
}
