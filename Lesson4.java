import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int kilom = scanner.nextInt();
//        if(kilom>0&&kilom<1000){
//            double miles = kilom*1.60934;
//            System.out.println(miles);
//        }
//        String s= scanner.nextLine();
//        int a =Integer.parseInt(s.substring(1));
//        int b =Integer.parseInt(s.substring(0,1));
//
//        System.out.println(a+""+b);
//        int balans = scanner.nextInt();
//        if(balans>0&&balans<100_000) {
//            double budget = balans / 30.;
//            //1 etap 100/30 = 3   2 etap 3.0
//            System.out.println(budget);
//        }
    int budget = scanner.nextInt();
    int gosta = scanner.nextInt();
    if (budget>0 && budget<100000 && gosta>0 && gosta<1000 && budget>gosta){
        System.out.println(budget/gosta);
    }
    }

}
