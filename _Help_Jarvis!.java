import java.util.*;
class Sample
{
    public static int digits(int n){
        int cnt = 0;
        while(n>0){
            cnt++;
            n/=10;
        }
        return cnt;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int ind = 0;
            int dle = digits(n);
            int arr[] = new int[dle];
            for(int i=0 ; i<dle ; i++){
                arr[i] = n%10;
                n/=10;
            }
            Arrays.sort(arr);
            boolean flag = true;
            for(int i=0 ; i<dle-1 ; i++)
            {
                if(arr[i+1]-arr[i] != 1){
                    flag = false;
                    break;
                }
            }
            System.out.println(flag? "YES": "NO");
        }
    }
}