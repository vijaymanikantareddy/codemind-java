import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String words[] = st.split(" ");
        for(int i=words.length-1 ; i>=0; i--){
            System.out.print(words[i]+" ");
        }
    }
}