import java.util.*;
class Sample
{
    public static boolean isvow(char c){
        if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            return true;
        return false;
    }
    
    public static void fun(String s)
    {
       String res="";
       for(int i=0 ; i<s.length() ; i++)
       {
           if(isvow(s.charAt(i))){
               res+="V";
           }
           else res+="C";
       }
       String last = res.charAt(0)+"";
       for(int i=1 ; i<res.length() ; i++){
           if(res.charAt(i)!=res.charAt(i-1)){
               last += res.charAt(i);
           }
       }
       System.out.println(last);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String inp=sc.nextLine();
        fun(inp);
    }
}