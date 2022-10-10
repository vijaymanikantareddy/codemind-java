import java.util.*;
class Sample
{
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(ch=='{' || ch=='(' || ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty())
                    return false;
                if((ch=='}' && st.peek()=='{') || (ch==')' && st.peek()=='(') || (ch==']' && st.peek()=='[')){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        if(isValid(st)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}