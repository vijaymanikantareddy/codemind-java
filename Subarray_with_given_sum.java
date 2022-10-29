import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int reqsum = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0 ; i<n ; i++)
                arr[i] = sc.nextInt();
            int be = -1, en = -1;
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
                        be = i+1;
                        en = j+1;
                        break;
                    }
                }
                if(be != -1 && en != -1){
                    break;
                }
            }
            if(be != -1 && en != -1){
                System.out.println(be +" "+ en);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}