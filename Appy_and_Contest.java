import java.util.Scanner;
class Sample
{
    public static long lcm(long a, long b){
    	long i=2, s=1;
    	while(i<a && i<b){
    		if(a%i==0 && b%i==0){
    			s*=i;
    			a/=i;
    			b/=i;	
    		}
    		else{
    			i++;
    		}
    	}
    	return s*a*b;
    } 
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            long n=s.nextLong();
            long a=s.nextLong();
            long b= s.nextLong();
            long k=s.nextLong();
            long ac=n/a, bc = n/b, lc= lcm(a,b);
            long abc = 2*(n/lc);
            if(ac+bc-abc>=k){
                System.out.println("Win");
            }
            else{
                System.out.println("Lose");
            }
        }
    }
}