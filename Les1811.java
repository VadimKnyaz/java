import java.util.Scanner;

public class Les1811 {
   public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//        int[] array = new int[n];
//        String[] s = scanner.nextLine().trim().split(" ");//"1 2 3 4 5"
//        for (int i = 0; i < s.length; i++) {
//            array[i] = Integer.parseInt(s[i]);
//        }
//        int m = Integer.parseInt(scanner.nextLine());
//        int[] array1 = new int[m];
//        String[] c = scanner.nextLine().trim().split(" ");
//        for (int i = 0; i < array1.length; i++) {
//            array1[i] = Integer.parseInt(c[i]);
//
//        }
//        boolean b = true;
//        if (array.length == array1.length) {
//
//            for (int i = 0; i < array.length; i++) {
//
//                if (array[i] != array1[i]) {
//                    b = false;
//                }
//            }
//        } else {
//            b = false;
//
//        }
//        System.out.println(b);
//       На вход подается число N — длина массива. Затем передается массив
//       целых чисел (ai) из N элементов. После этого аналогично передается второй
//       массив (aj) длины M.
//       Необходимо вывести на экран true, если два массива одинаковы (то есть
//               содержат одинаковое количество элементов и для каждого i == j элемент ai ==
//                       aj). Иначе вывести false.
//               Ограничения:
//● 0 < N < 100
//● 0 < ai < 1000
//● 0 < M < 100
//● 0 < a
//       j < 1000
//       Пример:
//       Входные данные Выходные данные
//       71
//       2 3 4 5 6 7
//       trueJava 12 
//       ДЗ 2 Часть 1
//       71
//       2 3 4 5 6 7
//       38
//       9 12 46
//       31
//       2 89 46
//       false
//       11
//       5
//       42
//       4 6 8
//       false

   Scanner sc =new Scanner(System.in);
   int n = Integer.parseInt(sc.nextLine());
   int []array = new int[n];
   String [] s = sc.nextLine().trim().split(" ");
       for (int i = 0; i <n ; i++) {
           array [i]= Integer.parseInt(s[i]);//автоматическая сортировка

       }


    }

}
