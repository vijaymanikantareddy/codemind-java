import java.util.Scanner;
class Sample
{
    public static int fact(int n){
        int res=1;
        for(int i=n ; i>0 ; i--){
            res*=i;
        }
        return res;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int res=0, tmp=a;
        while(a>0){
            int d = a%10;
            res += fact(d);
            a/=10;
        }
        if(tmp==res){
            System.out.println("The number "+tmp+" is a strong number");
        }
        else{
            System.out.println("The number "+tmp+" is not a strong number");
        }
    }
}