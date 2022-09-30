import java.util.*;
class Sample
{
    public static boolean fun(String s)
    {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int cnt=0;
        for(int i=0 ; i<s.length() ; i++)
        {
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), (int)hm.get(s.charAt(i))+1);
            }
            else{
                hm.put(s.charAt(i), 1);
            }
        }
        for(Map.Entry entry: hm.entrySet())
        {
            if((int)entry.getValue()%2!=0){
                cnt++;
            }
        }
        return cnt<=1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        if(fun(st)){
            System.out.println("Valid String");
        }
        else System.out.println("Not Valid");
    }
}