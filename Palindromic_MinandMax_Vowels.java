import java.util.*;
class Sample
{
    public static boolean isvow(char c){
        if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            return true;
        return false;
    }
    public static boolean ispalin(String st)
    {
        int l=0, r= st.length()-1;
        while(l<=r){
            if(st.charAt(l)!=st.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void fun(String s)
    {
        if(ispalin(s)==false){
        }
        else{
            int vc=0;
            for(int i=0 ; i<s.length() ; i++){
                if(isvow(s.charAt(i))){
                    vc++;
                }
            }
            if(vc==0){
                System.out.println("-1 -1");
                return ;
            }
            char max='A', min='u';
            for(int i=0 ; i<s.length() ; i++)
            {
                if(isvow(s.charAt(i)) && s.charAt(i)<min){
                    min = s.charAt(i);
                }
                if(isvow(s.charAt(i)) && s.charAt(i)>max){
                    max = s.charAt(i);
                }
            }
            System.out.println(min+" "+max);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String inp=sc.nextLine();
        String arr[] = inp.split(" ");
        for(int i=0 ; i<arr.length ; i++)
        {
            fun(arr[i]);
        }
    }
}