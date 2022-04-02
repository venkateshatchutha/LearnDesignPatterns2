package Structural.adapter;

import java.util.Date;

public interface paymentmethod {
    public void getcarddetails(int cardnum, String expiry, int cvv );
    public void Pay();
}
