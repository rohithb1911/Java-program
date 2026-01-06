import java.util.Scanner;
class Fibo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1,c;
        System.out.println("Fibonocci series:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}