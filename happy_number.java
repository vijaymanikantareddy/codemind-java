import java.util.Scanner;
class Sample
{
    public static int happy(int n)
    {
        int sum=0, res;
        while(n>0){
            res = n%10;
            sum+= res*res;
            n/=10;
        }
        if(sum>=1 && sum<=9)
            return sum;
        else 
            return happy(sum);
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(happy(n)==1 || happy(n)==7){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}