import java.util.Scanner;
class Sample{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int res[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=s.nextInt();
            res[i]=-1;
        }
        int mx=-1;
        for(int i = n-1 ; i>0 ; i--){
            if(arr[i]>mx){
                mx = arr[i];
            }
            res[i-1] = mx;
        }
        for(int i=0 ; i<n ; i++){
            System.out.print(res[i]+" ");
        }
    }
}