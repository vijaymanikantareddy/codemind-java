import java.util.Scanner;
class Sample{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=s.nextInt();
        }
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                if(i==j){
                    continue;
                }
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        boolean st=true;
        for(int i=0 ; i<n ; i++){
            if(arr[i]!=-1){
                System.out.print(arr[i]+" ");
                st = false;
            }
        }
        if(st){
            System.out.print(-1);
        }
    }
}