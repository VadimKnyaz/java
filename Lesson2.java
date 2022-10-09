import java.util.Locale;
import java.util.Scanner;
public class Lesson2 {
    public static void main(String[] args) {
//        String a = "hello";
//        String b = "Hello";
//        String c = new String("Hello");
//        System.out.println(a.toUpperCase());
//        System.out.println(a);
//        System.out.println(a.equals(c));
//        System.out.println(a.equalsIgnoreCase(c));

//        String sicret = "EXIT";
//        String sicrett = "EXIT";//00
//        Scanner scannner = new Scanner(System.in);
//        while (true){
//            String string  = scannner.nextLine();
//            if (string.equals(sicret)){
//                System.out.println("Vihod");
//                break;

//            }
//        }
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (scanner.hasNextInt()){
            int s = scanner.nextInt();
            sum +=s;
            i++;
            if (s>max){
                max = s;
            }
            if (s<min){
                min = s;
            }
       }
        //1 2 4 5
        System.out.println(sum);
        System.out.println(sum/i);
        System.out.println(max);
        System.out.println(min);


    }
}
