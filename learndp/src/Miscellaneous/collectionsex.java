package Miscellaneous;
import java.util.*;

public class collectionsex {
    public static void main(String[] args) {
        List<String> arr= new ArrayList<String>(Arrays.asList("ramu","eat","cat","raju"));

        for(int i=0; i<arr.size();i++){
            if(arr.get(i).endsWith("at")){
                arr.remove(i);// it will not work fine
            }
        }

        System.out.println(arr.toString());
        List<String> arr2= new ArrayList<String>(Arrays.asList("ramu","eat","cat","raju"));

        Iterator<String> it = arr2.iterator();
        while (it.hasNext()){
            if (it.next().endsWith("at")){
                it.remove();
            }
        }
        System.out.println(arr2.toString());

        List<Integer> arr3 = new ArrayList<>(Arrays.asList(1,5,2,3,4,5,6));
        arr3.remove(new Integer(1));

        Collections.sort(arr3);
        System.out.println(arr3);

        // arr3.sort(comparator);


    }
}
