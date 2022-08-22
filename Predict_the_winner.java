import java.util.Scanner;
class Sample
{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int arr[] = new int[n];
        int x=0, y=0;
        for(int i=0 ; i<n ; i++){
            arr[i]=s.nextInt();
            if(i%2==0){
                x+= arr[i];
            }
            else{
                y+=arr[i];
            }
        }
        if(Math.abs(x-y)%4==0){
            System.out.print("X");
        }
        else{
            System.out.print("Y");
        }
    }
}