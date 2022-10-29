import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String n = sc.nextLine();
            String st = sc.nextLine();
            HashMap<Character, Integer> mp = new HashMap<>();
            for(int i=0 ; i<st.length() ; i++){
                if(mp.containsKey(st.charAt(i))){
                    mp.put(st.charAt(i), (int)mp.get(st.charAt(i))+1);
                }
                else{
                    mp.put(st.charAt(i),1);
                }
            }
            boolean notfound = true;
            for(int i=0 ; i<st.length() ; i++){
                if((int)mp.get(st.charAt(i))==1){
                    System.out.println(st.charAt(i));
                    notfound = false;
                    break;
                }
            }
            if(notfound){
                System.out.println(-1);
            }
        }
    }
}