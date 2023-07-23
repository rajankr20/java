public class assignment {
    public static void main(String[] args) {

        int n=11;
   //R
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==0|| i==0&&  j<=(n-1)/2 || i==(n-1)/2 && j<=(n-1)/2 || j==(n-1)/2 &&i<=(n-1)/2 || i-j==(n-1)/2  ){
                    System.out.print( "*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

   // A

    //J

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0||  j==(n-1)/2 || i==(n-1) && j<=(n-1)/2   || j== 0 &&i>=(n-1)/2    ){
                    System.out.print( "*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

   // A

    //N
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==0||  j==(n-1)|| i-j== 0  ){
                    System.out.print( "*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

  //  K

   // U
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==0   ||  j==(n-1) || i==(n-1)     ){
                    System.out.print( "*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    //  M

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==0||  j==(n-1) || i-j==0 && i<(n-1)/2   || i+j== (n-1) &&i<=(n-1)/2    ){
                    System.out.print( "*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

      //  A
     //   R

//Q 3
        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || i == (n - 1) || j == (n - 1) || i + j <= (n - 1) / 2  || j-i >= (n - 1) / 2 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");

        }

       // Q2

        for(int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                if (  i == (n - 1)/2 || i+j >= (n - 1)/2 &&i<=(n-1)/2 &&  j-i <= (n - 1) / 2    ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");

        }
    }
}
