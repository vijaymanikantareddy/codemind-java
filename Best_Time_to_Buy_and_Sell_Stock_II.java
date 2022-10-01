import java.util.*;
class Sample
{
    public static int fun(int arr[])
    {
        int sum=0;
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i]-arr[i-1]>0){
                sum+=arr[i]-arr[i-1];
            }
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ar1[] = new int[a];
        for(int i=0 ; i<a ; i++){
            ar1[i]=sc.nextInt();
        }
        System.out.println(fun(ar1));
    }
}