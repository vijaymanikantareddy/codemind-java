import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int nums[] = new int[m];
        
        for(int i=0 ; i<m ; i++)
            nums[i]=sc.nextInt();
            
        int n = sc.nextInt();
        int index[] = new int[n];
        
        for(int i=0 ; i<n; i++)
            index[i]=sc.nextInt();
            
        ArrayList list = new ArrayList<>();
        
        for(int i=0 ; i<n ; i++){
            list.add(index[i], nums[i]);
        }
        
        for(int i=0 ; i<n ; i++){
            System.out.print(list.get(i)+" ");
        }
    }
}