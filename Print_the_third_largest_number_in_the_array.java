import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
            ts.add(arr[i]);
        }
        arr = new int[ts.size()];
        int ind=0;
        for(int ele : ts){
            arr[ind++] = ele;
        }
        if(arr.length>2)
            System.out.println(arr[arr.length-3]);
        else System.out.println("It is not possible");
    }
}