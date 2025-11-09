import java.util.Scanner;
class Adam_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sq = num * num;           
        int rev = reverse(num);      
        int sqrev = rev * rev;        
        int revsq = reverse(sq);     

        if (sqrev == revsq)
            System.out.println(num + " is an Adam number");
        else
            System.out.println(num + " is not an Adam number");
    }
    static int reverse(int n) {
        int r = 0;
        while (n > 0) {
            r = (r * 10) + (n % 10);
            n = n / 10;
        }
        return r;
    }
}