package Arrays;

import java.util.ArrayList;

import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        int arr1[] = {4, 9, 5};
        int arr2[] = {9, 4, 9, 8, 4};
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int num : arr1){
            set.add(num);
        }
        for(int num : arr2){
            if(set.contains(num)){
                list.add(num);
                set.remove(num);
            }
        }
        System.out.println(list);
       
    }
}
