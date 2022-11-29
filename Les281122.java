import java.util.Random;
import java.util.Scanner;

public class Les281122 {
    public static void main(String[] args) {
        //System.out.println((int) (Math.random()*10));
        Les281122 les281122 = new Les281122();
        les281122.luckyDigit();
    }

    public void luckyDigit() {
        System.out.println("Vvedite predel zagadivaemih csisel");
        Scanner scanner = new Scanner(System.in);
        int predel = Integer.parseInt(scanner.nextLine());
        Random random = new Random();
        int anyNumber = random.nextInt(predel);
        System.out.println("viberite kjlishestvo popitok ndlya ugadivaniya");
        int counter = Integer.parseInt(scanner.nextLine());

        while (counter>0){
                int m = Integer.parseInt(scanner.nextLine());
                if (anyNumber == m) {
                    System.out.println("Pobeda");
                    break;
                } else if (m < 0) {
                    System.out.println("Konec");
                    break;
                } else if (m < anyNumber) {
                    System.out.println("Zagadanje chislo bolshe");
                } else {
                    System.out.println("Zagadanje chislo menshe");

                }
            counter--;
            System.out.println("Ostalos popitok " +counter);
        }
        }
    }

