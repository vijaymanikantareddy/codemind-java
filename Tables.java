import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int a = s.nextInt();
        for(int i=1 ; i<=a ; i+=2){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
}