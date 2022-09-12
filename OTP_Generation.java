import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        String res="";
        for(int i=0 ; i<ch.length ; i++)
        {
            int d = ch[i]-'0';
            if(d%2!=0){
                res += Integer.toString(d*d);
            }
        }
        System.out.println(res);
    }
}