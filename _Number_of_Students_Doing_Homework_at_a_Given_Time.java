import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int arr[] = new int[a];
        for(int i=0 ; i<a ; i++){
            arr[i]=s.nextInt();
        }
        int cnt=0;
        int b = s.nextInt();
        int arb[] = new int[b];
        for(int i=0 ; i<b; i++){
            arb[i]=s.nextInt();
        }
        int end=s.nextInt();
        for(int i=0 ; i<b ; i++){
            if(end>=arr[i] && arb[i]>=end){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}