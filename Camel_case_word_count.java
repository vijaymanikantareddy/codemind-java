import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        int cnt=1;
        for(int i=1 ; i<ch.length ; i++){
            if(Character.isUpperCase(ch[i])){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}