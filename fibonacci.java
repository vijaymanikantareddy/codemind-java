import java.util.Scanner;
class Sample{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a=0, b=1;
        int n=s.nextInt();
        if(n==1){
            System.out.print(a+" ");
        }
        else if(n==2){
            System.out.print(a+" "+b+" ");
        }
        System.out.print(a+" "+b+" ");
        for(int i=2; i<n ; i++){
            int c = a+b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }
    }
}