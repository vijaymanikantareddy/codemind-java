import java.util.*;
class Sample
{
    public static boolean fun(String s)
    {
        int h=0, v=0;
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch=='L'){
                h++;
            }
            else if(ch=='R'){
                h--;
            }
            else if(ch=='U'){
                v++;
            }
            else {
                v--;
            }
        }
        return (h==0 && v==0);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        if(fun(st)){
            System.out.println("True");
        }
        else System.out.println("False");
    }
}