import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int sum=0, cnt=0;
        String s = sc.nextLine();
        for(int i=0 ; i<s.length() ; i++)
        {
            if(s.charAt(i)=='L'){
                sum++;
            }
            else sum--;
            if(sum==0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}