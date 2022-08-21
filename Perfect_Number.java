import java.util.Scanner;
class Sample{
    public static boolean perfect(int n){
        int temp=0;
        for(int i=1 ; i*i<=n ; i++){
            if(n%i==0){
                if(n!=n/i){
                    temp+= i+n/i;
                }
                else temp+=i;
            }
        }
        return temp==n;
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if(perfect(a)){
            System.out.println("True");
        }
        else 
            System.out.println("False");
    }
}