package Arrays;
public class Majorityele {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,2};
        int count=0;
        int candidate=0;
        for(int i=0; i<=arr.length-1; i++){
            int curr=arr[i];
            if(count == 0){
                candidate=curr;
                count=1;
            }
            else if(curr == candidate){
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println("Msjority element : "+candidate);
    }   
}
