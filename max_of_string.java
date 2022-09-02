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
        char mx=ch[0];
        for(int i=0 ; i<st.length() ; i++){
            if(mx<ch[i]){
                mx = ch[i];
            }
        }
        System.out.println(mx);
    }
}