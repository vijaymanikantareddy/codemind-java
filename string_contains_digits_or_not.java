import java.util.*;
class Sample{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        String abc = s.nextLine();
        for(int j=t;j>0;j--){
            String str;
            int digits=0;
            str=s.nextLine();
            for(int i=0; i<=str.length()-1; i++){
                char ch=str.charAt(i);
                if(ch>='0' && ch<='9') 
                {
                    digits++;
                }
            }
            if(digits>0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }    
    }
}