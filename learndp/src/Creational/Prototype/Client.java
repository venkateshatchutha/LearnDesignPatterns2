package Creational.Prototype;

public class Client {
    public static void main(String[] args) {
        Shape r1= new rectangle(10,7);
        r1.draw();
        rectangle r2= (rectangle) r1.clone();
        r2.draw();
        //rectangle r3= rectangle.clone();
        shape1 s=new circle();
        circle c= (circle) s.clone();

    }
}
