package exceptionHandling;

class Ammount{
    Ammount(String currency, int ammount){
        this.currency=currency;
        this.ammount=ammount;
    }
    String currency;
    int ammount;
}

class AmmountAdder{
    public  AmmountAdder(Ammount ammount1, Ammount ammount2) throws Exception {
        if(!ammount1.currency.equals(ammount2)){
            throw new Exception("currencies didnt match");
        }
    }
}




public class exceptionhandling {
    public static void main(String[] args) {
        Ammount Ammount1= new Ammount("Doller",3);
        Ammount ammount2=new Ammount("INR",4);
        try {

            AmmountAdder a =new AmmountAdder(Ammount1,ammount2);
        }catch (Exception e){

        }

    }
}


