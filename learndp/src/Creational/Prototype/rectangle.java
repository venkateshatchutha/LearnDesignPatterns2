package Creational.Prototype;

public class rectangle extends Shape{
    public rectangle(int width1, int height1){
        super(width1,height1);
        //width=width1;
        //height=height1;
    }
    @Override
    public Shape clone() {
        return new rectangle(width,height);
    }

    @Override
    public void draw() {
        System.out.println("drawing rectangle width"+width+" height "+height);
    }
}
