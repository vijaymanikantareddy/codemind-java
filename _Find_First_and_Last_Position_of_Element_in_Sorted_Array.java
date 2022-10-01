import java.util.*;
class Sample
{
    public static void fun(int arr[], int target)
    {
        int fi=-1, la=-1;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==target){
                fi = i;
                break;
            }
        }
        for(int i=arr.length-1 ; i>=0 ; i--){
            if(arr[i]==target){
                la = i;
                break;
            }
        }
        System.out.println(fi+" "+la);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int ar1[] = new int[a];
        for(int i=0 ; i<a ; i++){
            ar1[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        fun(ar1, target);
    }
}