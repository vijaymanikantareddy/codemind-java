import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int mx=1, cnt=1;
        for(int i=1 ; i<s.length() ; i++)
        {
            char a=s.charAt(i), b = s.charAt(i-1);
            if(a-b==0)
            {
                cnt++;
            }
            else{
                mx = mx>cnt? mx: cnt;
                cnt=1;
            }
            if(cnt>mx){
                mx = cnt;
            }
        }
        System.out.println(mx);
    }
}