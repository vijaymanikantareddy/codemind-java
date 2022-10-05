import java.util.*;
class Sample
{
    public static boolean isprime(int n)
    {
        if(n==0 || n==1){
            return false;
        }
        for(int i=2 ; i*i<=n ; i++)
        {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void fun(int n)
    {
        boolean set = false;
        for(int i=2 ; i*i<=n ; i++)
        {
            if(n%i==0 && isprime(i) && isprime(n/i) && i!=n/i){
                set = true;
                break;
            }
        }
        if(set){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0)
        {
            int a = sc.nextInt();
            // System.out.println(a);
            fun(a);
        }
    }
}