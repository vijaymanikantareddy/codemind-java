import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=n ; j++){
                if(j==1){
                    System.out.print("* ");
                }
                else if(j==n){
                    System.out.print("* ");
                }
                else if(i==j){
                    System.out.print("* ");
                }
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}