import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        int ele = sc.nextInt();
        int fnd=-1;
        if(ele>arr[0]){
            for(int i=0 ; i<n ; i++){
                if(arr[i]==ele){
                    fnd=i;
                    break;
                }
            }
        }
        else{
            for(int i=n-1 ; i>=0 ; i--){
                if(arr[i]==ele){
                    fnd=i;
                    break;
                }
                if(arr[i]>arr[n-1]){
                    break;
                }
            }
        }
        System.out.println(fnd);
    }
}