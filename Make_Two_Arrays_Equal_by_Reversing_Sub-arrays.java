import java.util.*;
class Sample
{
    public static boolean fun(int ar1[], int ar2[])
    {
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        if(ar1.length!=ar2.length)
            return false;
        for(int i=0 ; i<ar1.length ; i++){
            if(ar1[i]!=ar2[i])
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ar1[] = new int[a];
        for(int i=0 ; i<a ; i++){
            ar1[i]=sc.nextInt();
        }
        int b = sc.nextInt();
        int ar2[] = new int[b];
        for(int i=0 ; i<b ; i++){
            ar2[i]=sc.nextInt();
        }
        if(fun(ar1, ar2)){
            System.out.println("True");
        }
        else System.out.println("False");
    }
}