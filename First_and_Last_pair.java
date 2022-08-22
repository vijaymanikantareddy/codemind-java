import java.util.Scanner;
class Sample
{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=s.nextInt();
        }
        int i=0, j=n-1;
        while(i<=j){
            if(n%2!=0 && i==j){
                System.out.print(arr[i]+" "+0);
                break;
            }
            System.out.print(arr[i]+" "+arr[j]+" ");
            i++;
            j--;
        }
    }
}