import java.util.Scanner;
class Sample{
    public static boolean prime(int n){
        if(n<=1) return false;
        for(int i=2 ; i*i<=n ; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=a ; i<=b ; i++){
            if(prime(i))
                System.out.println(i);
        }
    }
}