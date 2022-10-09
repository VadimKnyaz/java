import java.util.Scanner;

public class peremennaya {
    public static void main(String [] args ) {
       Scanner scanner=new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i <10 ; i++) {
            int a = scanner.nextInt();
            sum = sum+a;
            //sum+=a;
        }
        System.out.println(sum);
    }
}
