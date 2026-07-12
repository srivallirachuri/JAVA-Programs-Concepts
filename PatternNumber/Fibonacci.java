package PatternNumber;
import java.util.*;
class Fibonacci{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First term");
        int first=s.nextInt();
      System.out.println("Enter second term");
      int second=s.nextInt();
       System.out.print("How many terms? ");
        int n = s.nextInt();
     
       for(int i=1; i <= n; i++){
        int next=first+second;
        System.out.println(next + " ");
        first=second;
        second=next;
       }
    }
}