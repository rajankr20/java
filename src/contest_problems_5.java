import java.util.Scanner;

public class contest_problems_5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the totalpage n :");
        int n= sc.nextInt();
        System.out.println("Enter the no Of Page  x :");
        int x= sc.nextInt();
        System.out.println("Enter the number of days y:");
        int y= sc.nextInt();
        if(n<=(x*y)){
            System.out.println("YES ");
        }else {
            System.out.println("NO");
        }
    }
}
