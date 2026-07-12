package PatternNumber;

import java.util.Scanner;

public class Primenum {
    public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter n");
   int n=s.nextInt();
   boolean [] prime = new boolean[n+1];
   for(int i=2; i<=n; i++){
    prime[i]=true;
   }
   for(int i = 2; i * i <= n; i++){
    if(prime[i]){ 
        for(int j=i*i; j <= n; j+=i){
        prime[j]=false;
    }}
   
   }
   System.out.println("Prime number:");
   for(int i=2; i<=n; i++){
    if(prime[i]){
        System.out.println(i + " ");
    }
   }
   s.close();
    }
}
