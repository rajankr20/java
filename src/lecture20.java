import java.util.Scanner;

public class lecture20 {
  static  void pritnMatric(int [][] arr){
       for(int i = 0; i<arr.length; i++){
         for (int j =0; j<arr[i].length; j++){
           System.out.print(arr[i][j] + " ");
         }
         System.out.println();
       }
   }

   static void mul(int[][]a, int r1, int c1, int[][]b, int r2, int c2){
    if(r1 !=  c2 ) {
      System.out.println("Wrong Input ");
      return;
    }

  int [][] mul = new int[r1][c2];
    for(int i= 0; i<r1; i++) {
      for (int j = 0; j < c2; j++) {
        for (int k=0; k<c1; k++){
          mul [i][j] += a[i][k]*b[k][j] ;
        }

      }
    }
     System.out.println("mul of martix 1 and matrix 2");
    pritnMatric(mul);
   }

  public static void main(String[] args) {
    //  int [][] arr= new int[3][3];
//    int[][] arr = {{3, 5, 6},
//                  {7, 8, 9},
//                   {1, 2, 3},
//                  };

//    Scanner sc = new Scanner(System.in);
//    System.out.println("Enter the number of row : ");
//    int r = sc.nextInt();
//    System.out.println("Enter the number of colum");
//    int c  = sc.nextInt();
//    int [][] arr = new int[r][c];
//    System.out.println("Enter " + r*c + "Element");


    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of row ans colum of matrix 1: ");
    int r1 = sc.nextInt();
    int c1 = sc.nextInt();
    int [][] a = new int[r1][c1];
    System.out.println("Enter Matrix value :");

    for (int i= 0; i<r1; i++){
      for (int j= 0; j< c1; j++){
        a[i][j]  = sc.nextInt();
      }
    }
    System.out.println("Enter the number of row and colum of matrix 2: ");
    int r2 = sc.nextInt();
    int c2 = sc.nextInt();

    int [][] b = new int[r2][c2];
    System.out.println("Enter Matrix value");

    for (int i= 0; i<r2; i++){
      for (int j= 0; j<c2; j++){
          b[i][j]  = sc.nextInt();
      }
    }
    System.out.println("Matrix 1 :");
    pritnMatric(a);
    System.out.println("Matix 2 :");
    pritnMatric(b);
     mul (a,r1,c1,b,r2,c2);

  }
}


// SUM OF TWO MATRIX USING TWO USER INPUT

/*
 public class lecture20 {
  static  void pritnMatric(int [][] arr){
       for(int i = 0; i<arr.length; i++){
         for (int j =0; j<arr[i].length; j++){
           System.out.print(arr[i][j] + " ");
         }
         System.out.println();
       }
   }

   static void add(int[][]a, int r1, int c1, int[][]b, int r2, int c2){
    if(r1 != r2 || c1!= c2 ) {
      System.out.println("Wrong Input ");
      return;
    }

  int [][] sum = new int[r1][c1];
    for(int i= 0; i<r1; i++) {
      for (int j = 0; j < c1; j++) {
        sum[i][j] = a[i][j] + b[i][j];

      }
    }
     System.out.println("sum of martix 1 and matrix 2");
    pritnMatric(sum);
   }

  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of row ans colum of matrix 1: ");
    int r1 = sc.nextInt();
    int c1 = sc.nextInt();
    int [][] a = new int[r1][c1];
    System.out.println("Enter Matrix value :");

    for (int i= 0; i<r1; i++){
      for (int j= 0; j< c1; j++){
        a[i][j]  = sc.nextInt();
      }
    }
    System.out.println("Enter the number of row and colum of matrix 2: ");
    int r2 = sc.nextInt();
    int c2 = sc.nextInt();

    int [][] b = new int[r2][c2];
    System.out.println("Enter Matrix value");

    for (int i= 0; i<r2; i++){
      for (int j= 0; j<c2; j++){
          b[i][j]  = sc.nextInt();
      }
    }
    System.out.println("Matrix 1 :");
    pritnMatric(a);
    System.out.println("Matix 2 :");
    pritnMatric(b);
    //System.out.println("sum of matrix");
    add(a,r1,c1,b,r2, c2);

  }
}


      // MULTIPLICATION OF TWO MATRICES USING USER INPUT



  public class lecture20 {
  static  void pritnMatric(int [][] arr){
       for(int i = 0; i<arr.length; i++){
         for (int j =0; j<arr[i].length; j++){
           System.out.print(arr[i][j] + " ");
         }
         System.out.println();
       }
   }

   static void mul(int[][]a, int r1, int c1, int[][]b, int r2, int c2){
    if(r1 !=  c2 ) {
      System.out.println("Wrong Input ");
      return;
    }

  int [][] mul = new int[r1][c2];
    for(int i= 0; i<r1; i++) {
      for (int j = 0; j < c2; j++) {
        for (int k=0; k<c1; k++){
          mul [i][j] += a[i][k]*b[k][j] ;
        }

      }
    }
     System.out.println("mul of martix 1 and matrix 2");
    pritnMatric(mul);
   }

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of row ans colum of matrix 1: ");
    int r1 = sc.nextInt();
    int c1 = sc.nextInt();
    int [][] a = new int[r1][c1];
    System.out.println("Enter Matrix value :");

    for (int i= 0; i<r1; i++){
      for (int j= 0; j< c1; j++){
        a[i][j]  = sc.nextInt();
      }
    }
    System.out.println("Enter the number of row and colum of matrix 2: ");
    int r2 = sc.nextInt();
    int c2 = sc.nextInt();

    int [][] b = new int[r2][c2];
    System.out.println("Enter Matrix value");

    for (int i= 0; i<r2; i++){
      for (int j= 0; j<c2; j++){
          b[i][j]  = sc.nextInt();
      }
    }
    System.out.println("Matrix 1 :");
    pritnMatric(a);
    System.out.println("Matix 2 :");
    pritnMatric(b);
     mul (a,r1,c1,b,r2,c2);

  }
}



       */