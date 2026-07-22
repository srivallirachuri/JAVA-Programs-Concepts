package Arrays;

public class Movezeroes {
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        int start=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[start]=arr[i];
                start++;
            }
            
        }
        for(int i = start; i<arr.length; i++){
            arr[i]=0;
           
        }
        for(int num : arr){
            System.out.print(num + " ");
        }

    }
}
