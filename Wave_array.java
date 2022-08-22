import java.util.*;
class Sample{
    public static boolean fun(int arr[]){
        for(int i=1 ; i<arr.length-1 ; i++){
            if((arr[i]>arr[i-1] && arr[i]<arr[i+1]) || (arr[i]<arr[i-1] && arr[i]>arr[i+1]))
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=s.nextInt();
        }
        if(fun(arr)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}