import java.util.*;
class Sample{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=s.nextInt();
            }
        }
        
        for(int j=0;j<m;j++){
            int max=0;
            for(int i=0;i<n;i++){
                if(max<=arr[i][j]){
                    max=arr[i][j];
                }
            }
            System.out.println(max);
        }
    }
}