package PatternNumber;
import java.util.*;
class Palindrome{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENter the value");
        int val=s.nextInt();
        int remainder=0;
        int reversenum=0;
        int num=val;

        while(val != 0){
            remainder=val % 10;
            reversenum=reversenum*10+remainder;
            val = val / 10;
            
        }
        if(reversenum == num){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println(" Not a Palindrome number");
        }
        s.close();
        
    }
}