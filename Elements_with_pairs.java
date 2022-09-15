import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++)
            arr[i] = sc.nextInt();
        if(n%2==0)
        {
            for(int i=0 ; i<n ; i++)
                System.out.print(arr[i]+" ");
        }
        else{
            for(int i=0 ; i<n ; i++)
                System.out.print(arr[i]+" ");
            System.out.print(0);
        }
    }
}