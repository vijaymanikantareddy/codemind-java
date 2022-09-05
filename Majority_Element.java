import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0 ; i<n ; i++)
            arr[i]=sc.nextInt();
        int max=0, cnt=0, val=arr[0];
        for(int i=0 ; i<n ; i++){
            cnt=0;
            if(arr[i]==-1){
                continue;
            }
            for(int j=i+1 ; j<n ; j++){
                
                if(arr[i]==arr[j]){
                    cnt++;
                }
            }
            if(max<cnt){
                max = cnt;
                val = arr[i];
            }
        }
        System.out.println(val);
    }
}