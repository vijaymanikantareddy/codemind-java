import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(b<=a && c>0){
            System.out.println(-1);
        }
        else{
            int d1 = c;
            int d2 = 0;
            int sec = 0;
            while(d1>=d2)
            {
                d1 += a;
                d2 += b;
                sec++;
            }
            System.out.println(sec);
        }
        
    }
}