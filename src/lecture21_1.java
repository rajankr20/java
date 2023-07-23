import java.util.Scanner;

public class lecture21_1 {

        static  void printMatric(int [][] arr){
            for(int i = 0; i<arr.length; i++){
                for (int j =0; j<arr[i].length; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
//        static void InPlaceTranspose (int[][]matrix, int r, int c) {
//
//            for (int i = 0; i < c; i++) {
//                for (int j = 0; j < r; j++) {
//                    int temp = matrix[i][j];
//                    matrix[i][j] = matrix[j][i];
//                    matrix[j][i] = temp;
//                }
//            }
//        }
//        static void reverseArray(int []arr ){
//            int i= 0; int j= arr.length-1 ;
//            while (i<j){
//                int temp = arr[i];
//                arr[i]= arr[j];
//                arr[j]= temp;
//                i++;
//                j--;
//            }
//        }
        static int[][] pascal( int n) {
           int [][]ans =new int [n][];
           for(int i= 0; i<n; i++ ){
               ans[i]=new int [i+1];
               ans[i][0]= ans[i][i]=1;
               for (int j=1; j<i; j++){
                   ans[i][j] = ans[i-1][j] + ans [i-1][j-1];
               }
           }
           return ans;
        }
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter n : ");
            int n = sc.nextInt();
            int [][] ans = pascal(n);
            printMatric(ans);
//            System.out.println("Enter the number of row ans colum of matrix 1: ");
//            int r = sc.nextInt();
//            int c = sc.nextInt();
//            int [][] matrix = new int[r][c];
//            System.out.println("Enter Matrix value :");
//
//            for (int i= 0; i<r; i++){
//                for (int j= 0; j< c; j++){
//                    matrix[i][j]  = sc.nextInt();
//                }
//            }
//            System.out.println("Matrix  :");
//            printMatric(matrix);
//
//            System.out.println("Transpose of matrix :");
//            rotate(matrix,r);
//            System.out.println("Rotate of matrix ");
//            printMatric(matrix);

        }
    }


/*  WRITE A JAVA PROGRAM TO DISPLAY TRANSPOSE OF MATRIX ENTERED BY THE USER ?
 public class lecture21_1 {

        static  void printMatric(int [][] arr){
            for(int i = 0; i<arr.length; i++){
                for (int j =0; j<arr[i].length; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

        static int[][] findTranspose (int[][]matrix, int r, int c) {
            int[][] ans = new int[c][r];
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < r; j++) {
                    ans[i][j] = matrix[j][i];
                }

            }
           return ans;
        }

//static void findInPlaceTranspose (int[][]matrix, int r, int c) {
//
//            for (int i = 0; i < c; i++) {
//                for (int j = 0; j < r; j++) {
//                    int temp = matrix[i][j];
//                    matrix[i][j] = matrix[j][i];
//                    matrix[j][i] = temp;
//                }
//
//            }
//
//        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of row ans colum of matrix 1: ");
            int r = sc.nextInt();
            int c = sc.nextInt();
            int [][] matrix = new int[r][c];
            System.out.println("Enter Matrix value :");

            for (int i= 0; i<r; i++){
                for (int j= 0; j< c; j++){
                    matrix[i][j]  = sc.nextInt();
                }
            }

            System.out.println("Matrix  :");
            printMatric(matrix);

            System.out.println("Transpose of matrix :");
            int[][] ans= findTranspose(matrix,r, c);
            printMatric(ans);

//
//             System.out.println("Transpose of matrix :");
//            findInPlaceTranspose(matrix,r,c);
//            printMatric(matrix);


        }




        GIVEN A SQUARE MATRIX TURN IT BY 90 DEGREE IN A CLOCKWISE DIRECTION WITHOUT USING ANY EXTRA SPACE

         public class lecture21_1 {

        static  void printMatric(int [][] arr){
            for(int i = 0; i<arr.length; i++){
                for (int j =0; j<arr[i].length; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

        static void InPlaceTranspose (int[][]matrix, int r, int c) {

            for (int i = 0; i < c; i++) {
                for (int j = 0; j < r; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }

            }

        }
        static void reverseArray(int []arr ){
            int i= 0; int j= arr.length-1 ;
            while (i<j){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                i++;
                j--;

            }
        }
        static void rotate (int[][] matrix, int n) {
            // transpose
            InPlaceTranspose(matrix, n, n);

            //reverse each row of transposed matrix
            for (int i = 0; i < n; i++) {
                reverseArray(matrix[i]);

            }
        }
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of row ans colum of matrix 1: ");
            int r = sc.nextInt();
            int c = sc.nextInt();
            int [][] matrix = new int[r][c];
            System.out.println("Enter Matrix value :");

            for (int i= 0; i<r; i++){
                for (int j= 0; j< c; j++){
                    matrix[i][j]  = sc.nextInt();
                }
            }

            System.out.println("Matrix  :");
            printMatric(matrix);

            System.out.println("Transpose of matrix :");
            rotate(matrix,r);
            System.out.println("Rotate of matrix ");
            printMatric(matrix);


      // PRINT PASCAL TRIANGLE USING USER INPUT

     public class lecture21_1 {

        static  void printMatric(int [][] arr){
            for(int i = 0; i<arr.length; i++){
                for (int j =0; j<arr[i].length; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

         static int[][] pascal( int n) {
           int [][]ans =new int [n][];
           for(int i= 0; i<n; i++ ){
               ans[i]=new int [i+1];
               ans[i][0]= ans[i][i]=1;
               for (int j=1; j<i; j++){
                   ans[i][j] = ans[i-1][j] + ans [i-1][j-1];
               }
           }
           return ans;
        }
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter n : ");
            int n = sc.nextInt();
            int [][] ans = pascal(n);
            printMatric(ans);
 */