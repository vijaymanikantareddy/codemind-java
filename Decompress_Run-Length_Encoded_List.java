import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0 ; i<n ; i+=2)
        {
            for(int j=0 ; j<arr[i] ; j++){
                System.out.print(arr[i+1]+" ");
            }
        }
    }
}