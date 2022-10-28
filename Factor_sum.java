import java.util.*;
import java.io.*;
class Sample
{
    public static int factorsum(int n)
    {
        int s = 0;
        for(int i=1 ; i*i<=n ; i++){
            if(n%i==0){
                if(n/i!=i){
                    s += n/i;
                }
                s += i;
            }
        }
        return s;
    }
    public static void main(String args[]) throws Exception
    {
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);  
        String in = br.readLine();
        String sp[] = in.split(",");
        int arr[] = new int[sp.length];
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = Integer.parseInt(sp[i]);
        }
        
        Arrays.sort(arr);
        boolean not_found = true;
        
        for(int ele: arr)
        {
            int elesum = factorsum(ele);
            for(int i=0 ; i<arr.length ; i++){
                if(elesum == arr[i]){
                    System.out.print(ele+" ");
                    not_found = false;
                    break;
                }
            }
        }
        
        if(not_found){
            System.out.print("-1");
        }
    }
}