import java.util.Scanner;
class Sample
{
    public static int gcd(int a, int b)
    {
        if(a==0) return b;
        if(b==0) return a;
        return a>b? gcd(b, a%b): gcd(a, b%a);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++)
            arr[i] = sc.nextInt();
        int g = arr[0];
        for(int i=1 ; i<n ; i++)
        {
            g = gcd(g, arr[i]);
        }
        System.out.println(g);
    }
}