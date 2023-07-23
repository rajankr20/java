import java.util.Scanner;

public class contest_p11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the integer");
        int P = sc.nextInt();

        while(P-->0){
            System.out.println("enter the value n:");
            int n = sc.nextInt();
            System.out.println("enter the value of x:");
            int x = sc.nextInt();
            System.out.println("enter the String s:");
            String s = sc.next();
            int a = x, b=x;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='R'){
                    x++;
                }
                else{
                    x--;
                }
                if(x>a){
                    a=x;
                }
                if(x < b){
                    b=x;
                }
            }

            System.out.println(a-b+1);
        }
    }
}
