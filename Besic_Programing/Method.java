package Besic_Programing;
public class Method 
{
    static int a;
    static int b;
    static int c;
    static void add(int a,int b)
    {
        int result = a+b;
        System.out.println(result);
    }   
    static void add(int a,int b,int c)
    {
        int result = a+b+c;
        System.out.println(result);
    }
    public static void main(String[] args)
    {
        a= 8;
        b = 3;
        c =5;
        add(a,b);
        add(a,b,c);
    }
}
