import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int val=0;
        sc.nextLine();
        boolean set = false, po=true, neg=true;
        while(t-->0)
        {
            String ab = sc.nextLine();
            char a = ab.charAt(0);
            char b = ab.charAt(1);
            char c = ab.charAt(2);
            if(set){
                if(po)
                    val+=1;
                if(neg)
                    val-=1;
            }
            if(a=='+'){
                set = true;
                po = true;
                val+=1;
            }
            else if(c=='+'){
                set = false;
                val+=1;
            }
            else if(a=='-'){
                set = true;
                neg = true;
                val-=1;
            }
            else{
                set =false;
                val-=1;
            }
        }
        System.out.println(val);
    }
}