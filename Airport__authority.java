import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cost=0;
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++)
            arr[i] = sc.nextInt();
        int limit = sc.nextInt();
        for(int i=0 ; i<n ; i++)
        {
            if(arr[i]<=limit){
                cost+=1;
            }
            else cost+=2;
        }
        System.out.println(cost);
    }
}