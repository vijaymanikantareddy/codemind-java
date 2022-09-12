import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char ch[] = st.toCharArray();
        int arr[] = new int[26];
        int cnt=0, mx=0;
        for(int i=0 ; i<ch.length ; i++)
        {
            int d = ch[i]-'a';
            arr[d]++;
            if(d==0 || d==4 || d==8 || d==14 || d==20){
                cnt++;
                mx = mx>cnt? mx: cnt;
            }
            else{
                cnt=0;
            }
        }
        System.out.println(mx);
    }
}