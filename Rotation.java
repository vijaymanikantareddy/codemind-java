import java.util.*;
class Sample
{
    public static void fun(int arr[], int a, int b)
    {
        b = b%a;
        for(int i=a-b ; i<a ; i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0 ; i<a-b ; i++){
            if(i==a-b-1)
                System.out.print(arr[i]+"
");
            else System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int arr[] = new int[a];
            for(int i=0 ; i<a ; i++){
                arr[i]=sc.nextInt();
            }
            fun(arr,a,b);
        }
    }
}