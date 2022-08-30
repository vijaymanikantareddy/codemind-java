import java.util.Scanner;
class Sample
{
    public static boolean ispalin(int n){
        int res=0, temp=n;
        while(n>0){
            res = res*10+(n%10);
            n/=10;
        }
        return temp==res;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            if(ispalin(n)){
                System.out.println("True");
            }
            else System.out.println("False");
        }
    }
}