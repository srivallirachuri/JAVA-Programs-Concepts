package Arrays;

import java.util.HashSet;

public class Subarray2 {
    public static void main(String[] args) {
        int arr[]={1,2,-3,5,6,-9};
        int prefix=0;
        HashSet<Integer>set=new HashSet<>();
        for(int num : arr){
            prefix += num;
            if (prefix == 0) {
        System.out.println("Exists");
        return;
    }

    if(set.contains(prefix)){
        System.out.println("Exists");
    return;

    }
    
   
    set.add(prefix);
        }
    }
}
