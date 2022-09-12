import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int ind=0;
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        char res[] = new char[ch1.length + ch2.length];
        for(int i=0 ; i<ch1.length ; i++)
        {
            res[ind]=ch1[i];
            ind++;
        }
        for(int i=0 ; i<ch2.length ; i++)
        {
            res[ind]=ch2[i];
            ind++;
        }
        for(int i=0 ; i<res.length ; i++)
        {
            for(int j=i+1 ; j<res.length ; j++)
            {
                if(res[i]>res[j]){
                    char temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                }
            }
        }
        for(int i=0 ; i<res.length ; i++)
        {
            System.out.print(res[i]);
        }
    }
}