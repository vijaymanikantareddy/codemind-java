import java.util.Scanner;
class Sample
{
    public static void fun(int arr[], int n)
    {
        int res[] = new int[n];
        int temp=1;
        for(int i=0 ; i<n ; i++){
            res[i]=temp;
            temp *= arr[i];
        }
        temp = 1;
        for(int i=n-1 ; i>=0 ; i--){
            res[i] = temp*res[i];
            temp *= arr[i];
        }
        for(int i=0 ; i<n ; i++)
            System.out.print(res[i]+" ");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++)
            arr[i] = sc.nextInt();
        fun(arr, n);
    }
}