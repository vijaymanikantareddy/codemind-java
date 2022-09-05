import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            arr[i]=sc.nextInt();
        }
        int cnt=0, max=0;
        for(int i=0 ; i<n ; i++)
        {
            if(arr[i]==1){
                cnt++;
            }
            else{
                max = max<cnt? cnt: max;
                cnt=0;
            }
        }
        max = max>cnt? max: cnt;
        System.out.println(max);
    }
}