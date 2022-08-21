import java.util.*;
class Sample
{
    public static int gcd(int a, int b)
    {
        while(b>0){
            if(a>b){
                int temp=b;
                b = a;
                a = temp;
            }
            b%=a;
        }
        return a;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]= s.nextInt();
        }
        int res=arr[0];
        for(int i: arr){
            res = gcd(res, i);
        }
        System.out.println(res);
    }
}