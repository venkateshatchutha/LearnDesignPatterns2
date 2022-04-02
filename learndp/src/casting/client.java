package casting;

public class client {
    public static void main(String[] args) {
        animal a= new dog();
        a.sayName();
        a.eat();
        dog d=(dog)a;
        d.bark();
        //d.breed="g";
        System.out.println();
        dog d1=new dog();
        //System.out.println();
        Integer i =new Integer("2");
        Integer b=2;
        //Integer b=i;
        int k=2;
        i=k;
        String str= new String("HIII");
        System.out.println(i==b);
        //System.out.println(i.toString());
        int i2=2;


    }
}
