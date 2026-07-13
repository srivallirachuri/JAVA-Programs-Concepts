package PatternNumber;

import java.util.Scanner;

public class Perfectnum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter num ");
        int n=s.nextInt();
        int sum=0;
        for(int i=1; i<n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        if(sum == n){
            System.out.println("Perfect number");

        }
        else{
            System.out.println("Not a perfect num");
        }
        s.close();
        
    }
}
