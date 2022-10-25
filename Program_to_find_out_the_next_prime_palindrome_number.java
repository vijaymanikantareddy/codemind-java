import java.util.*;
class Sample
{
    public static boolean isPalin(int n){
        int temp = n, rev=0;
        while(temp>0)
        {
            rev = rev * 10 + (temp%10);
            temp /= 10;
        }
        return rev == n;
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2 ; i*i<=n ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n++;
        while(true){
            if(isPrime(n) && isPalin(n))
                break;
            n++;
        }
        System.out.println(n);
    }
}