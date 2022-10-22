import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        int t = sc.nextInt();
        double res = p * (Math.pow((1 + r / 100), t));
        System.out.printf("%.2f", res);
    }
}