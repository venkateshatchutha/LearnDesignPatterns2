package Structural.adapter;

import java.util.Date;

public class payUadapter implements paymentmethod{
    payU payU = new payU();
    @Override
    public void getcarddetails(int cardnum, String expiry, int cvv) {
        payU.entercardnumber(cardnum);
        payU.entercvv(cvv);
        payU.enterexpiry(expiry);
    }


    @Override
    public void Pay() {

    }
}
