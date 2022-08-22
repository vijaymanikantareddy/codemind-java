import java.util.*;
class Sample
{
    public static boolean descend(int arr[]){
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]>=arr[i-1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=s.nextInt();
        }
        if(descend(arr)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}