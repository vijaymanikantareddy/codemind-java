import java.util.*;
class Sample
{
    public static void show(String s)
    {
        for(int i=s.length()-1 ; i>=0 ; i--){
            System.out.print(s.charAt(i));
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String arr[] = st.split(" ");
        for(int i=0 ; i<arr.length ; i++)
        {
            if(i==0)
                show(arr[i]);
            else{
                System.out.print(" ");
                show(arr[i]);
            }
        }
    }
}