package Multithreading;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;

public class test1 {
    public static void main(String[] args) {
        //[3,2,1,2,1,2,1,4,5,8,6,7,4,9]
        ArrayList<Integer> a = new ArrayList<Integer>();
        int arr[] =new int[]{3,2,1,2,1,2,1,4,5,8,6,7,4,9};

        System.out.println(findmaxdist(arr));
    }

    public static int findmaxdist(@NotNull int array[]){
        int ans=0;
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<array.length;i++){
            if(map.containsKey(array[i])){
                int a=i-map.get(array[i]);
                if(a>ans){
                    ans=a;
                }

            }else{
                map.put(array[i],i);
            }
        }

        return ans;

    }
}
