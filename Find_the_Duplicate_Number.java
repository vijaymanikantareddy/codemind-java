import java.util.*;
class Sample
{
    public static int fun(int arr[])
    {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int cnt=0;
        for(int i=0 ; i<arr.length ; i++)
        {
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], (int)hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i], 1);
            }
        }
        for(int i=0 ; i<arr.length ; i++)
        {
            if(hm.get(arr[i])!=1){
                return arr[i];
            }
        }
        return arr[0];
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(fun(arr));
    }
}