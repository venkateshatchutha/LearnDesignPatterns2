package Miscellaneous;

import java.io.LineNumberInputStream;
import java.util.*;

public class arrays {
    public static void main(String[] args) {
        System.out.println(solve(new int[][] {  new int[]{0, 0, 1, 0, 1, 0, 1, 1, 1},
                new int[]{0, 1, 0, 0, 1, 1, 1, 0, 1}}));
        ArrayDeque<int[]> p= new ArrayDeque<>();
        p.size();
        p.removeFirst();
        assert(1==2):"principal is ";
        ArrayList<ArrayList<Integer>> arr6= new ArrayList<>();
        arr6.add(new ArrayList<Integer>());
        //List<Integer> a= new Stack<>();
        int[] arr1= new int[]{1,2,3,4,5};
        int arr3[]=new int[20];
        arr1[0]=1;
        arr1[2]=2;
        int j= arr1.length;
        int[][] arr= new int[2][2];
        arr[0][1]=1;
        //arr1[5]=4;
        //ArrayList<Integer> arr4= (ArrayList<Integer>) Arrays.asList(arr1);
        ArrayList<Integer> arr2= new ArrayList<Integer>();
        arr2.add(0,23);
        arr2.add(3);
        //int k= arr1.length();
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

    public static int solve(int[][] A) {
        int count=0;
        for (int i=0; i<A.length; i++){
            for ( int j=0; j<A[0].length; j++){
                if (A[i][j]==1){
                    count++;
                    findisland(A,i,j);
                }
            }
        }
        return count;


    }

    public static void findisland(int[][] A, int i, int j){
        if(i>= A.length || j>= A[0].length || i<0 || j<0 || A[i][j]==0){
            return;
        }
        A[i][j]=0;
        findisland(A,i-1, j);
        findisland(A,i, j-1);
        findisland(A,i+1, j);
        findisland(A,i, j+1);
        findisland(A,i-1, j-1);
        findisland(A,i+1, j+1);
        findisland(A,i-1, j+1);
        findisland(A,i+1, j-1);
    }

}
