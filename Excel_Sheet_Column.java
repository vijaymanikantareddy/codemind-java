import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String res="";
        while(n>0){
            int d = n%26;
            if(d==0){
                res = 'Z'+res;
                n = n/26 - 1;
            }
            else{
                res = (char)(64+d)+ res;
                n/=26;
            }
        }
        System.out.println(res);
    }
}