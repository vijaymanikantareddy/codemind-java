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
        int cnt=0;
        for(int i=a ; i<=b ; i++){
            if(prime(i))
                cnt++;
        }
        System.out.println(cnt);
    }
}