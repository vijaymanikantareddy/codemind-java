import java.util.Scanner;
class Pattern
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1 ; i<=n ; i++){
            if(n%2!=0){
                for(int j=1 ; j<=n-2 ; j++){
                    System.out.print(j);
                }
                for(int k=1 ; k<n-2 ; k++){
                    System.out.print(k);
                }
                System.out.println();
            }
            else{
                for(int j=1 ; j<=n-2 ; j++){
                    System.out.print(j);
                }
                for(int k=1 ; k<n-2 ; k++){
                    System.out.print(k);
                }
                System.out.println();
            }
        }
    }
}