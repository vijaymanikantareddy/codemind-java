import java.util.Scanner;
class Sample{
    public static boolean divi(int n){
        int temp=n;
        while(n>0){
            int d = n%10;
            if(d==0) return false;
            if(temp%d!=0)
                return false;
            n/=10;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        for(int i=a ; i<=b ; i++){
            if(divi(i)){
                System.out.print(i+" ");
            }
        }
    }
}