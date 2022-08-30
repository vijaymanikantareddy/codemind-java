import java.util.Scanner;
class Sample
{
    public static int leng(int n){
        int l=0;
        while(n>0){
            l++;
            n/=10;
        }
        return l;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        int res=0, le=leng(n);
        int l = (int)Math.pow(10,a);
        int f = (int)Math.pow(10,le-a);
        int last = n%l;
        int first = n/f;
        System.out.println(Math.abs(first-last));
    }
}