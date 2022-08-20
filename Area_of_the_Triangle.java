import java.io.*;
class Sample{
    public static void main(String args[])throws Exception{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int a,b,c;
    float s,area;
    String input;
    input=br.readLine();
    String in[]=input.split(" ");
    a=Integer.parseInt(in[0]);
    b=Integer.parseInt(in[1]);
    c=Integer.parseInt(in[2]);
    s=(float)(a+b+c)/2;
    area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.format("%.2f",area);
    }
}