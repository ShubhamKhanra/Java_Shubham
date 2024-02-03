package Besic_Programing;
public class Recurtion 
{
    int a = 30;
    public static void main(String[] args) 
    {
        int result = add(30);
        System.out.println(result);
    }
    public static int add(int a)
    {
        if (a>0) 
        {
            return a+add(a-1);
        }
        else
            return 0;
    }
}
