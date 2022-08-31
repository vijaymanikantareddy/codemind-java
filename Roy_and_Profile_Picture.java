import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        int l = s.nextInt();
        int t = s.nextInt();
        while(t-->0){
            int b = s.nextInt();
            int h = s.nextInt();
            if(l>b || l>h){
                System.out.println("UPLOAD ANOTHER");
            }
            else if(l<=b && l<=h && b==h){
                System.out.println("ACCEPTED");
            }
            else{
                System.out.println("CROP IT");
            }
        }
    }
}