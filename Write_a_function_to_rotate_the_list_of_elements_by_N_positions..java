import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++)
            arr[i] = sc.nextInt();
        int d = sc.nextInt();
        d = d%n;
        int k = n-d;
        for(int i = k ; i<n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0 ; i<k ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}