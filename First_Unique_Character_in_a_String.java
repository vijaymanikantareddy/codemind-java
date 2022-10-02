import java.util.*;
class Sample{
    public static int fun(String st)
    {
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int i=0 ; i<st.length() ; i++)
        {
            char ch = st.charAt(i);
            if(mp.containsKey(ch))
            {
                mp.put(ch, (int)mp.get(ch)+1);
            }
            else
                mp.put(ch,1);
        }
        for(int i=0 ; i<st.length() ; i++){
            if(mp.get(st.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(fun(st));
    }
}