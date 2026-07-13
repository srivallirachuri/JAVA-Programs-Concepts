package PatternNumber;

public class GCDLCM {
    public static void main(String[] args) {
    int a=48;
    int b=18;
    int num1=a;
    int num2=b;
    while(num2 != 0){
        int temp=num2;
        num2=num1 % num2;
        num1=temp;

    }
    int gcd=num1;
    System.out.println("GDC is:"+gcd);
    int lcm=(a * b)/gcd;
System.out.println("LCM is :" +lcm);
} 
}
