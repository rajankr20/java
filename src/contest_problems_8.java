import java.util.Scanner;

public class contest_problems_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer N : ");
        int n = sc.nextInt();

        if(n<10){
            System.out.println("Thanks for helping Chief!");
        }else {
            System.out.println("-1");
        }
    }
}
