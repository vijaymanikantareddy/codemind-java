import java.util.*;
class Sample
{
    public static boolean fun(int n)
    {
        int sq = (int)Math.sqrt(n);
        // System.out.println(sq + " " + n);
        return sq*sq==n;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
            if(fun(arr[i])){
                s += arr[i];
            }
            // System.out.print(arr[i]+" ");
        }
        System.out.println(s);
    }
}