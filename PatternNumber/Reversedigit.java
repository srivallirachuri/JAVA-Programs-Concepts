package PatternNumber;

public class Reversedigit {
    public static void main(String[] args) {
        int digit=12345;
        int reverse=0;
       while(digit != 0){
        int rem=digit % 10;
        reverse=reverse*10+rem;
        digit/=10;
       }
       System.out.println("Reverse num :" +reverse);
    }
}
