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
        int cnt=0;
        boolean set = true;
        char p= sc.next().charAt(0);
        for(int i=0 ; i<st.length() ; i++){
            if(p==ch[i]){
                cnt++;
                set = false;
            }
        }
        System.out.println(set? -1: cnt);
    }
}