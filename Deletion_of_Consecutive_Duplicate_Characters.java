import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-->0)
        {
            String st = sc.nextLine();
            int cnt = 0;
            for(int i=0 ; i<st.length()-1 ; i++)
            {
                if(st.charAt(i) == st.charAt(i+1)){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}