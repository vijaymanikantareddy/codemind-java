import java.util.Scanner;
class Sample
{
    public static boolean isugly(long n){
        if(n==0)    return false;
        if(n==1)    return true;
        while(n>0){
            if(n%2==0)
                n/=2;
            if(n%3==0)
                n/=3;
            if(n%5==0)
                n/=5;
            if(n%2!=0 && n%3!=0 && n%5!=0)
                break;
        }
        return n==1? true: false;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        if(isugly(a)){
            System.out.println("Ugly Number");
        }
        else{
            System.out.println("Not Ugly Number");
        }
    }
}