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
    public static boolean mega(int n){
        if(prime(n)){
            while(n>0){
                int d = n%10;
                if(!prime(d)){
                    return false;
                }
                n/=10;
            }
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(mega(n)){
            System.out.println("Mega Prime");
        }
        else System.out.println("Not Mega Prime");
    }
}