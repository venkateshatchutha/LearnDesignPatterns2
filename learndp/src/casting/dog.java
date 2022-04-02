package casting;

public class dog extends animal {
    public final String  breed;
    public dog(){
        super("hi");
        this.breed="df";
        System.out.println("creating dog");
    }
    @Override
    public void eat(){
        System.out.println("dog is eating");
    }
    public void bark(){
        System.out.println("bow bow");
    }
}
