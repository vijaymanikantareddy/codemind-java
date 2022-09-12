import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int sp=n-1, rw=1;
        for(int i=1 ; i<=n ; i++){
            for(int j=0 ; j<sp ; j++){
                System.out.print(" ");
            }
            for(int j=0 ; j<rw ; j++){
                System.out.print(i);
            }
            if(i<n)
                System.out.println();
            sp--;
            rw+=2;
        }
    }
}