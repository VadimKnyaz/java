import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        String str = String.valueOf(n);
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i));
//
//        }
//        int eight = 0;
//        int four = 0;
//        int two = 0;
//        int one = 0;
//        eight=n/8;
//        int lost = n%8;
//        four = lost/4;
//        lost = lost%4;
//        two = lost/2;
//        lost = lost%2;
//        one=lost;

//        while (n >= 8) {
//            n = n - 8;
//            v++;
//        }
//        while (n >= 4) {
//            n = n - 4;
//            c++;
//        }
//        while (n >= 2) {
//            n = n - 2;
//            d++;
//        }
//        while (n >= 1) {
//            n = n - 1;
//            o++;
//        }
//        System.out.println(eight+" "+four+" "+two+" "+one);

//Sting char att !=" ">счётчик
//if !=" " nj
        int counter = 0;
        String s = scanner.nextLine().trim();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                counter++;
            }
        }
        System.out.println(counter);

    }

}

