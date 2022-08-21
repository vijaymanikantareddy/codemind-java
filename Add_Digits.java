import java.util.Scanner;
class Sample
{
    public static int addDigits(int n){
        if(n==0) return 0;
        if(n%9==0) return 9;
        return n%9;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(addDigits(a));
    }
}