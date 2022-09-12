import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int sp=n-1;
        for(int i=1 ; i<=n ; i++){
            for(int j=0 ; j<sp ; j++){
                System.out.print(" ");
            }
            for(int k=i-1 ; k>0 ; k--){
                System.out.print(k);
            }
            for(int j=0 ; j<i ; j++){
                System.out.print(j);
            }
            if(i<n)
                System.out.println();
            sp--;
        }
    }
}