package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Dplicates {
    public static void main(String[] args) {

    Scanner s=new Scanner(System.in);
        System.out.println("Size:");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                System.out.println("Duplicates removed : " +arr[i]);
            }
            
        }
        
        s.close();
}
}