import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int even[] = new int[n];
        int odd[] = new int[n];
        int a=0, b=0;
        for(int i=0 ; i<n ; i++){
            arr[i]=s.nextInt();
            if(arr[i]%2==0){
                even[a]=arr[i];
                a++;
            }
            else{
                odd[b]=arr[i];
                b++;
            }
        }
        for(int i=0 ; i<a ; i++){
            System.out.print(even[i]+" ");
        }
        for(int i=0 ; i<b ; i++){
            System.out.print(odd[i]+" ");
        }
    }
}