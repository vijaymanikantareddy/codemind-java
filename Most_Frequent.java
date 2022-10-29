import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0 ; i<arr.length ; i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i], (int)mp.get(arr[i])+1);
            }
            else
                mp.put(arr[i],1);
        }
        int mx = mp.get(arr[0]), mx_num = arr[0];
        for(Map.Entry<Integer, Integer> en : mp.entrySet()){
            if(en.getValue() == mx && mx_num > en.getKey()){
                mx_num = (int)en.getKey();
            }
            if(en.getValue()> mx){
                mx = (int)en.getValue();
                mx_num = (int)en.getKey();
            }
        }
        System.out.println(mx_num);
    }
}