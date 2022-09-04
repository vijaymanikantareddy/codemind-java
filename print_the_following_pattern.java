import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int end=n;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<end ; j++)
            {
                char ch = (char) (64+end);
                System.out.print(ch+" ");
            }
            end--;
            System.out.println();
        }
    }
}