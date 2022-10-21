import java.io.*;
import java.util.*;

class Basic
{
    public static boolean isPalin(int num){
        if(num<0){
            num = -num;
        }
        String s = Integer.toString(num);
        int l = 0, r = s.length()-1;
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPalin(n)){
            System.out.println("2");
        }
        else System.out.println("1");
    }
}
