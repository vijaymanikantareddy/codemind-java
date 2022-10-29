
import java.util.*;

import java.io.*;
 
class Code
{
    public static void main(String args[])
    {
        double p,t,r;
        Scanner s=new Scanner(System.in);
        p=s.nextDouble();
        r=s.nextDouble();
        t=s.nextDouble(); 
        double c = p *(Math.pow((1 + (r / 100)), t));
        System.out.format("%.2f",c);
    }
}