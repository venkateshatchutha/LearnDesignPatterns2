package Miscellaneous;

import java.util.ArrayList;

public class arrays {
    public static void main(String[] args) {
        assert(1==2):"principal is ";
        int arr1[]= new int[5];
        arr1[0]=1;
        arr1[2]=2;
        //arr1[5]=4;
        ArrayList<Integer> arr2= new ArrayList<Integer>();
        arr2.add(0,23);
        arr2.add(3);
        for(int a : arr2){
            System.out.println(a);;
        }
        System.out.println(arr2);

        try{
            assert(1>2);
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
