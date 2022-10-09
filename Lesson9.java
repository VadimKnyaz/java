import java.util.Scanner;

public class Lesson9 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int sum = 0;
//        int p = scanner.nextInt();
//        for (int i = 0; i < n ; i++) {
//            int a = scanner.nextInt();
//            if(a>p){
//              sum=sum+a;
//            }
//        }
//        System.out.println(sum);
// Продумать какой из циклов будет отвечать за высоту и ширину
// Продумат где нужно будет выводить на экран Q а где просто переносить с
// Не забыть поработать с переменными счётчиками чтобы не вышел вечн
//принт и лн за один раз 1 Q

        int shirina = 10;
        int visota = 5;

        while (visota > 0) {

            visota = visota - 1;
            shirina = 10;
            while (shirina > 0) {

                System.out.print("Q");

                shirina = shirina - 1;
            }
            System.out.print("\n");
        }


    }
}


//        int a =5;
//        String s = "QQQQQQQQQQ";
//
//        while (s.length() == 10) {
//            s = s.substring(0, 10);
//            System.out.println(s);
//        }while(a==5){
//            System.out.println();
//       }



