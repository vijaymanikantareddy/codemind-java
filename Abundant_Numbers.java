import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res=1;
        for(int i=2 ; i*i<=n ; i++){
            if(n%i==0){
                int a = n/i;
                if(a==i){
                    res += a;
                }
                else{
                    res += i+a;
                }
            }
        }
        if(res>n){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}