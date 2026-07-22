package Arrays;


import java.util.HashSet;

public class Pairs {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        int arr[]={2,4,5,8,9};
        int tar=13;
        for(int num : arr){
            int need=tar-num;
            if(set.contains(need)){
                System.out.println("Pair found :" + need + ", " + num );
            }
            set.add(num);

            }
            }
        }

     

