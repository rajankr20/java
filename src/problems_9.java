import java.util.Scanner;

public class  problems_9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the positive integer P :");
        int p=input.nextInt();
        int i=0;
        while(i<p) {
            System.out.println("Enter the value of A: ");
            int a=input.nextInt();
            System.out.println("Enter the value of B :");
            int b=input.nextInt();
            int n=a+b;
            match(n);
            i++;
        }

    }
    public static void match(int n) {
        int total=0;
        while(n!=0) {
            int temp=n%10;
            n=n/10;
            if(temp==2||temp==3||temp==5) total=total+5;
            else if(temp==6||temp==9) total=total+6;
            else if(temp==1) total=total+2;
            else if(temp==0) total=total+8;
            else if(temp==4) total=total+4;
            else if(temp==7) total=total+3;
            else if(temp==8) total=total+7;
        }
        System.out.println(total);
    }
}
