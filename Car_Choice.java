import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0)
        {
            float x1 = sc.nextFloat();
            float x2 = sc.nextFloat();
            float y1 = sc.nextFloat();
            float y2 = sc.nextFloat();
            if(x1/y1 < x2/y2){
                System.out.println(1);
            }
            else if(x1/y1 > x2/y2){
                System.out.println(-1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}