import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 10;
//
//        int c = a;
//        a = b;
//        b=c;
        Scanner scanner = new Scanner(System.in);
        int min1 = scanner.nextInt();
        int min2 = scanner.nextInt();
        if (min1 > min2) {
            int temp = min1;
            min1 = min2;
            min2 = temp;
        }//5 5 6 ///4 5 3///4 6 5
        while (scanner.hasNextInt()){
           int temp = scanner.nextInt();
           if (min1 == min2){
               if(min1>temp) {
                   min1 = temp;
               }else {
                   min2 = temp;
               }
           } else if (min1>temp) {
               min2 = min1;
               min1 = temp;
           } else if (temp>min1 && temp < min2) {
               min2 =temp;
           }
        }
        System.out.println(min2);

//           int min1 = scanner.nextInt();
//           int min2 = scanner.nextInt();
//           if()
//













        }
    }

