package PatternNumber;

import java.util.Scanner;

public class Armstrongnumber {
    public static void main(String[] args) {
        
    
    Scanner s=new Scanner(System.in);
     System.out.println("ENter the value");
    int num=s.nextInt();
    int original=num;
    int remainder;
    int sum=0;
    while(num != 0){
        remainder=num % 10;
        sum +=(int) Math.pow(remainder,3);
        num /= 10;
       
    }
     if(sum == original){
            System.out.println("Arsmstrong number");
        }
        else{
     System.out.println(" Not a Arsmstrong number");
        }
        s.close();

}
}