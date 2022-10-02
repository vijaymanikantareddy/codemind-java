import java.util.*;
class Sample
{
    public static boolean isvow(char c){
        if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            return true;
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String vo="";
        for(int i=0 ; i<st.length() ; i++)
        {
            if(isvow(st.charAt(i))){
                vo+=st.charAt(i)+"";
            }
        }
        int j = vo.length()-1;
        for(int i=0 ; i<st.length() ; i++){
            if(isvow(st.charAt(i))){
                System.out.print(vo.charAt(j));
                j--;
            }
            else System.out.print(st.charAt(i));
        }
    }
}