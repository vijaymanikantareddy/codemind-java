import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reqsum = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++)
            arr[i] = sc.nextInt();
        int cnt = 0;
        for(int i=0 ; i<n ; i++)
        {
            for(int j=i ; j<n ; j++)
            {
                int sum = 0;
                for(int k = i ; k<=j ; k++)
                {
                    sum+=arr[k];
                }
                if(sum == reqsum){
                    cnt++;
                }
            }
        }
        
        System.out.println(cnt);
    }
}