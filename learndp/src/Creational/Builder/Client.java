package Creational.Builder;

import java.math.BigInteger;

public class Client {
    long  a=1234567891;
    public static void main(String[] args) {

        employee e= new employee.employeebuilder(BigInteger.valueOf(1234567891),"venkatesh").addemail("test@email.com").addPassword("password").build();
        employee e3= employee.getBuilder(BigInteger.valueOf(1234567891),"venkatesh").addemail("test@email.com").addPassword("password").build();
        employee.employeebuilder eb= new employee.employeebuilder(BigInteger.valueOf(1234567891),"venkatesh");
        eb.addemail("t@asd.asd");
        employee e2=eb.build();
        System.out.println(e2.toString());
        eb.addPassword("test");
        //eb.build();
        System.out.println(e2.toString());
    }
}
