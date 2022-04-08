package Miscellaneous;

import java.util.*;

public class set {
    public static void main(String[] args) {

        Set<String> s=new HashSet<String>();
        s.add("apple");
        s.add("dsd");
        s.add("dsf");
        System.out.println(s);
        System.out.println(s.contains("apple"));

        Set<Integer> hset= new HashSet<Integer>();
        hset.add(23456);
        hset.add(2345);
        hset.add(234);
        hset.add(23);
        hset.add(2);
        System.out.println(hset);
        Set<Integer> lset=new LinkedHashSet<Integer>(hset);
        lset.add(5);
        lset.add(3);
        lset.add(6);
        System.out.println(lset);// maintains the order
        Set<Integer> Tset= new TreeSet<Integer>(hset);
        System.out.println(Tset);
    }
}
