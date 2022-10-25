import java.util.*;
class Sample
{
    public static boolean prime(int n)
    {
        if(n<=1){
            return false;
        }
        for(int i=2 ; i*i<=n ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0 ; i<n ; i++)
            {
                arr[i] = sc.nextInt();
            }
            int min_in=0, max_in = 0, mi = arr[0], ma = arr[0];
            for(int i=0 ; i<n ; i++){
                if(ma<arr[i]){
                    ma = arr[i];
                    max_in = i;
                }
                if(mi > arr[i]){
                    mi = arr[i];
                    min_in = i;
                }
            }
            int cnt=0;
            if(max_in>min_in)
                for(int i=min_in ; i<=max_in ; i++){
                    if(prime(arr[i])){
                        cnt++;
                    }
                }
            else{
                for(int i=max_in ; i<=min_in ; i++){
                    if(prime(arr[i])){
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
    }
}