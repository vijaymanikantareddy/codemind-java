import java.util.Scanner;
class Sample
{
    public static long gcd(long a, long b){
        if(b==0)
            return a;
        if(a%b==0)
            return b;
        if(b>a){
            long temp=a;
            a = b;
            b = temp;
        }
        return gcd(b, a%b);
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        long b = s.nextLong();
        System.out.println(gcd(a,b));
    }
}