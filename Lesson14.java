import java.util.Arrays;
import java.util.Scanner;

public class Lesson14 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//            int[] array = new int[n];
//            for (int i = 0; i < n; i++) {
//                array[i] = scanner.nextInt();
//            }
//            int min = array[0];
//        for (int i = 1; i <array.length ; i++) {
//            if(array[i]<min){
//                min =array[i];
//            }
//        }System.out.println(min);

//        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//        double[] array = new double[n];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextDouble();
//        }
//        System.out.println(srArivm(array));
//    }
//    public static double srArivm(double[]array) {
//     double summ= 0;
//        for (int i = 0; i <array.length ; i++) {
//           summ+=array[i];
//        }
//        return summ/array.length;
//     1.5 2.7 5.3
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int[] array1 = new int[m];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        boolean isEqual = true;
        if(array.length==array1.length){
            for (int i = 0; i <array.length ; i++) {
                if(array[i]!=array1[i]){
                    isEqual=false;
                }
            }
        }else {
            isEqual = false;
        }
        System.out.println(isEqual);
    }
}
