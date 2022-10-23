import java.util.*;

class Basic
{
    public static int lcm(int a, int b){
        int res = a>b? a: b;
        int mx = res;
        int mi = a<b? a: b;
        if(res%a==0 && res%b==0){
            return res;
        }
        while(res%a!=0 || res%b!=0){
            res += mx;
        }
        return res;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int res = arr[0];
        for(int i=1 ; i<n ; i++){
            res = lcm(res, arr[i]);
        }
        System.out.println(res);
    }
}