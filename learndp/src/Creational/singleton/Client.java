package Creational.singleton;

public class Client {
    public static void main(String[] args) {
        singletonenum s1=singletonenum.instance;
        singletonenum s2= singletonenum.instance;
        System.out.println(s1.getValue());
        s1.setValue(5);
        System.out.println(s1.getValue());
        System.out.println(s2.getValue());
        if(s1==s2){
            System.out.println("s1=s2");

        }

    }

}
