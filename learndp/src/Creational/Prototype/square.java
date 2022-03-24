package Creational.Prototype;

public class square extends Shape{
    public square(int width1){
        super(width1,width1);
        //width=width1;
        //height=width1;
    }
    @Override
    public Shape clone() {
        return new square(width);
    }

    @Override
    public void draw() {
        System.out.println("drawing rectangle width"+width+" height "+height);
    }
}
