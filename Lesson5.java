import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int time = scanner.nextInt();
//        if (time>=0 && time<=23){
//            if(time > 12) {
//                System.out.println("Pora");
//            }else {
//                System.out.println("Rano");
//            }
//        }
//        int deyNamber = scanner.nextInt();
//        if(deyNamber>=1 && deyNamber <=7){
//            if(deyNamber >=6) {
//                System.out.println("Ura");
//            }else {
//                System.out.println(6-deyNamber);
//            }
//        }
//    int kountN = scanner.nextInt();
//    if(kountN<500) {
//        System.out.println("Beginer");
//    }else if(500<=kountN&& kountN<1500) {
//        System.out.println("Pre");
//    }else if (1500<=kountN && kountN <2500) {
//        System.out.println("Inter");
//    }else if(2500<kountN && kountN<3500) {
//        System.out.println("upper");
//    }else{
//        System.out.println("Fluent");

        String s =scanner.nextLine().trim();
        if (s.length()>2 && s.length()<100 && s.contains(" ")){
            int index = s.indexOf(" ");
            String first = s.substring(0,index);
            String second = s.substring(index,s.length());
            System.out.println(first);
            System.out.println(second.trim());
        }
//        System.out.println("   a b        ");
//        System.out.println("   a b        ".trim());

    }
}
