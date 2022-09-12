import java.util.Scanner;
class Sample
{
    public static boolean fun(String s)
    {
        char st[] = s.toCharArray();
        for(int i=0 ; i<st.length ; i++){
            int d = st[i]-'0';
            if(d<0 || d>9){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String sm = sc.nextLine();
        while(t-->0)
        {
            String st = sc.nextLine();
            if(fun(st)){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
    }
}