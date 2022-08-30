import java.util.Scanner;
class Sample
{
    public static boolean isprime(int n){
        if(n<=1) return false;
        for(int i=2 ; i*i<=n ; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean set = true;
        for(int i=2 ; i*i<=n ; i++){
            if(n%i==0){
                if(isprime(i) && isprime((int)n/i)){
                    System.out.println(i+" "+(int)n/i);
                    set = false;
                    break;
                }
            }
        }
        if(set){
            System.out.println(-1);
        }
    }
}