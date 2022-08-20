import java.util.*;
class Sample
{
    public static boolean ispalin(int n){
        int temp=n, rev=0;
        while(n>0){
            int d=n%10;
            rev = rev*10+d;
            n/=10;
        }
        return temp==rev;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int arr[] = new int[n];
        int cnt=0;
        for(int i=0 ; i<n ; i++){
            arr[i]=s.nextInt();
        }
        for(int i : arr){
            if(ispalin(i)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}