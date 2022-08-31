import java.util.Scanner;
class Sample
{
    public static long reverse(long n){
        long res=0;
        while(n>0){
            long d=n%10;
            res = res*10+d;
            n/=10;
        }
        return res;
    }
    
    public static boolean ispalin(long n){
        long temp=n, res=reverse(n);
        return temp==res;
    }
    
    public static void  main(String args[])
    {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        n += reverse(n);
        while(!ispalin(n)){
            n += reverse(n);
        }
        System.out.println(n);
    }
}