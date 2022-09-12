import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int last = n-1;
        if(n<3 || n>100){
            System.out.println("The pattern is not possible");
        }
        else{
            for(int i=1 ; i<n*2 ; i++)
            {
                if(i<=n)
                {
                    for(int j=1 ; j<=i ; j++)
                    {
                        System.out.print("*");
                    }
                }
                else{
                    for(int j=1 ; j<=last ; j++)
                    {
                        System.out.print("*");
                    }
                    last--;
                }
                System.out.println();
            }
        }
    }
}