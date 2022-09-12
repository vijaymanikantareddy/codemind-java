import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int beg=1, end=n, st=1;
        for(int i=1 ; i<=n ; i++)
        {
            for(int j=1 ; j<=n ; j++)
            {
                if(j==beg || j==end){
                    System.out.print("x");
                }
                else{
                    System.out.print("0");
                }
            }
            if(st<n/2+1){
                beg++;
                end--;
            }
            else{
                beg--;
                end++;
            }
            System.out.println();
        }
    }
}