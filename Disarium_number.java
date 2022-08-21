import java.util.*;
class Sample{
    public static int digitcnt(int n){
        int c=0;
        while(n>0){
            c++;
            n/=10;
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int tmp=n, res=0, p=digitcnt(n);
        while(n>0){
            int d = n%10;
            double sam = Math.pow(d, p);
            res += Math.round(sam);
            p--;
            n/=10;
        }
        if(res==tmp){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}