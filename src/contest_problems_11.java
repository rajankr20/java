import java.util.Scanner;

public class contest_problems_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of steps n :");
        int n = sc.nextInt();
        //int r = sc.nextInt();

       // int l = sc.nextInt();
        System.out.println("Enter the integer :");
        int m= sc.nextInt();
        String s = "Robot" ;
        for (int i =n; i<=m; i++ )
        if(i>=n){
            n++;

        }else {
            n--;
        }
        System.out.println(n);
    }
}


//chef's son chefu found some matches in the kitchen and he immediately starting playing with them . question and answer
//chief is playing a video game , and is getting close to the end . he decides to finish the rest of the game in a single session question and answer