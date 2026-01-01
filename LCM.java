import java.util.Scanner;
class LCM
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int ans;
        if(a>b)
          ans=a;
        else
          ans=b;
        while(true)
        {
            if(ans%a==0&&ans%b==0)
             break;
            ans++;
        }
        System.out.printf("lcm of %d and %d is %d",a,b,ans);
    }
}