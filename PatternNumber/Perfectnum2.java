package PatternNumber;

import java.util.Scanner;

public class Perfectnum2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter num ");
        int n=s.nextInt();
        int sum=1;
        for(int i=2; i*i < n; i++){
            if(n % i == 0){
                sum += i;
            }
            if(i != n/i){
                sum += n/i;
            }
        }
           if (n == 1) {
    System.out.println("Not a perfect number");
} else if (sum == n) {
    System.out.println("Perfect number");
} else {
    System.out.println("Not a perfect number");
}
    }
 
}
