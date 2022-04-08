package exceptionHandling;

class currencyexception extends Exception{

    public currencyexception(String currencies_didnt_match) {

    }
}


class AmmountAdder2{
    public  AmmountAdder2(Ammount ammount1, Ammount ammount2) throws Exception {
        if(!ammount1.currency.equals(ammount2)){
            throw new currencyexception("currencies didnt match");
        }
    }
}





public class customexceptionhandling {
    public static void main(String[] args) {
        Ammount Ammount1= new Ammount("Doller",3);
        Ammount ammount2=new Ammount("INR",4);
        try {

            AmmountAdder2 a =new AmmountAdder2(Ammount1,ammount2);
        }catch (Exception e){
            System.out.println(e);

        }

    }
}
