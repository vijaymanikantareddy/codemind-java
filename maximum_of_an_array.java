import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=s.nextInt();
        }
        int max = arr[0];
        for(int i: arr){
            if(max<i)
                max = i;
        }
        System.out.println(max);
    }
}