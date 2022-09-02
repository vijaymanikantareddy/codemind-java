import java.util.Scanner;
class Sample{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        char ch[] = new char[st.length()];
        for(int i=0 ; i<st.length(); i++){
            ch[i]= st.charAt(i);
        }
        int a=sc.nextInt();
        int b = sc.nextInt();
        for(int i=a ; i<=b ; i++){
            System.out.print(ch[i]);
        }
    }
}