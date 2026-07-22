package Arrays;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=s.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i] > secondlargest && arr[i] != largest){
                secondlargest=arr[i];
            }
        }
        if(secondlargest == Integer.MIN_VALUE){
            System.out.println("No second largest");
        }
        System.out.println("largest : " +largest);
        System.out.println("second largest : " +secondlargest);
    }
}
