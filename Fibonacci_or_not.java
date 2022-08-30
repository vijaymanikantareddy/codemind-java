import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a=0, b=1;
        boolean set = true;
        if(n==0 || n==1){
            System.out.print("True");
            set = false;
        }
        else{
            int c = a+b;
            while(c<=n){
                a = b;
                b = c;
                c = a+b;
                if(c==n){
                    System.out.print("True");
                    set = false;
                }
            }
        }
        if(set){
            System.out.print("False");
        }
    }
}