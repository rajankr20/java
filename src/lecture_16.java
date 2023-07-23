import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class lecture_16 {

    public static void main(String[] args) {

        String str ="i am rajankuamr";
        char []ch = str.toCharArray();
        Arrays.sort(ch);
        String s = new String(ch);

        int max = 0;
        int count = 1;
        char ans = '-';
        for (int i = 1; i <= s.length(); i++) {
            if ((i == s.length()) || (s.charAt(i) != s.charAt(i - 1))) {
                if (max < count) {
                    max = count;
                    ans = s.charAt(i-1);
                }count = 1;
            } else {
                count++;
            }
        }
        System.out.println("Maximum occurring character is "+ans);






        //REVERSING STRING DIFFERENT CASES:----

    // case 1 "pwjava" - avajwp
//        String str1 = "pwjava";
//        String str2 = " ";
//        for (int i=str1.length()-1; i>=0; i-- ){
//            str2 +=str1.charAt(i);
//
//        }
//        System.out.println(str2);


//        // case 2 "pwskill java" - java pwskill
//        String str1 = "pwskill java";
//        String str2 = " ";
//        String sarr[]= str1.split(" ");
//        for (int i=sarr.length-1; i>=0; i-- ){
//            str2=str2+sarr[i]+" ";
//           // str2.append(sarr[i]).append(" ");
//
//        }
//        System.out.println(str2);

  //case 3 "pwskill java" -  llikswp avaj
//         String str1="pwskill java";
//         String str2="";
//         String arr[]= str1.split(" ");
//         for (String elem : arr){
//             for(int i=elem.length()-1 ; i>=0; i--)
//             {
//                 str2=str2+elem.charAt(i);
//             }
//             str2 = str2+ " ";
//         }
//
//         System.out.println("Before Reversing: " + str1);
//         System.out.println("After Reversing: " +str2);


        //PALINDROME PROGRAM
//
//         String str1= "2552";
//         String str2 = "";
//         for(int i= str1.length()-1; i>=0; i--){
//             str2 += str1.charAt(i);
//         }
//         if(str1.equals(str2)){
//             System.out.println("String is palindrome :");
//         }else {
//             System.out.println("NOT palindrome ");
//         }
//         System.out.println("Before Reversing: " + str1);
//         System.out.println("After Reversing: " +str2);


        //ANAGRAM PROGRAM

//        String str1 = "School Master";
//        String str2 = "The Classroom";
//        str1 = str1.replace(" ", "");
//        str2 = str2.replace(" ", "");
//
//        str1= str1.toLowerCase();
//        str2 = str2.toLowerCase();
//
//        char arr1[] = str1.toCharArray();
//        char arr2[] = str2.toCharArray();
//
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//        if(Arrays.equals(arr1,arr2)){
//            System.out.println("IT IS AN ANAGRAM :");
//        }else {
//            System.out.println("NOT ANAGRAM :");
//        }

        //PANGRAM PROGRAM
//        boolean flag= false;
//        String str = "THE QUICK ROWN FOX JUMPS OVER LAZY DOG";
//        str = str.replace(" ","");
//         // to convert upper or lover case
//            char []ch=str.toCharArray();
//
//            int []ar= new int[26];
//            for(int i=0; i<ch.length;i++){
//                ar[ch[i]-65]++;
//            }
//            for(int i=0;i<ar.length;i++){
//                if(ar[i]==0){
//                    System.out.println("not pangram");
//                    flag= true;
//                }
//            }
//            if(flag==false){
//                System.out.println("its pangram");
//            }






    }
}
