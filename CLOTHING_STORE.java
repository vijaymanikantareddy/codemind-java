import java.util.Scanner;
class Sample
{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=s.nextInt();
        }
        int cnt=0;
        for(int i=0 ; i<n; i++){
            if(arr[i]==-1)
                continue;
            for(int j=i+1 ; j<n ; j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}