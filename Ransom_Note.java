import java.util.*;
class Sample
{
    public static boolean fun(String s1, String s2)
    {
        int arr[] = new int[26];
        for(int i=0 ; i<s2.length() ; i++){
            int d = s2.charAt(i)-97;
            arr[d]++;
        }
        for(int i=0 ; i<s1.length() ; i++){
            int d = s1.charAt(i)-97;
            arr[d]--;
            if(arr[d]<0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if(fun(s1,s2))  System.out.println("True");
        else System.out.println("False");
    }
}