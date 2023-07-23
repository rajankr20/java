import java.util.Scanner;

public class contest_problems_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the battery level :");
        int battery = sc.nextInt();

        if(battery<= 15){
            System.out.println("Yes ");
        }else {
            System.out.println("No");
        }


    }
}
