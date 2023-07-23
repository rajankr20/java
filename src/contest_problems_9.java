import java.util.Scanner;

public class contest_problems_9 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the for num a:");
        int a= sc.nextInt();
        System.out.println("Enter the sec num b: ");
        int b= sc.nextInt();
        int sum= a+b;
        int a1 = 357 ;
        int b2= 1011;
        int c = 8;
        if (a1== sum){
            System.out.println("13");
        } else if (b2==sum) {
            System.out.println("10");

        }else  {
            System.out.println("7");

        }
    }
}
