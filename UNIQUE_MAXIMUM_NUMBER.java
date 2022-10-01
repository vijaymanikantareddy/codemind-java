import java.util.*;
class Sample
{
    public static int fun(int arr[])
    {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0 ; i<arr.length ; i++)
        {
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], (int)hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i], 1);
            }
        }
        int max=-9999;
        for(int i=0 ; i<arr.length ; i++)
        {
            if(hm.get(arr[i])==1 && arr[i]>max){
                max = arr[i];
            }
        }
        // for(Map.Entry entry: hm.entrySet())
        // {
        //     if((int)entry.getValue()==1){
                
        //     }
        // }
        return max==-9999? -1: max;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(fun(arr));
    }
}