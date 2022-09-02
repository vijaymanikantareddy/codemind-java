import java.util.Scanner;
class Sample{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        char ch[] = new char[st.length()];
        for(int i=0 ; i<st.length(); i++){
            ch[i]= st.charAt(i);
        }
        int v=0, c=0, d=0, sp=0;
        for(int i=0 ; i<st.length() ; i++){
            if(ch[i]=='a' || ch[i]=='A' || ch[i]=='e' || ch[i]=='E'|| ch[i]=='o'|| ch[i]=='O'||ch[i]=='I'||ch[i]=='i'||ch[i]=='u'||ch[i]=='U'){
                v++;
            }
            else if(ch[i]==' '){
                sp++;
            }
            else if((ch[i] >= '0' && ch[i] <= '9')){
                d++;
            }
            else{
                c++;
            }
        }
        System.out.println("Vowels: "+v);
        System.out.println("Consonants: "+c);
        System.out.println("Digits: "+d);
        System.out.println("White spaces: "+sp);
    }
}
