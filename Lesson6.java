import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String model = scanner.nextLine();
//        int prise = scanner.nextInt();
//        if ((prise > 50000 && prise < 120000) && (model.contains("samsung") ||
//                model.contains("iphone"))) {
//            System.out.println("mogno ");
//        }else {
//            System.out.println("Net");
//        }
//
        String pas = scanner.nextLine();
        boolean aper = false;
        boolean lower = false;
        boolean number = false;
        boolean simvols = false;
        String base = "!@#$%^&*()_+;";
        if (pas.length() >= 8) {

            for (int i = 0; i < pas.length(); i++) {

                if (Character.isUpperCase(pas.charAt(i))) {
                    aper = true;
                } else if (Character.isLowerCase(pas.charAt(i))) {
                    lower = true;
                } else if (Character.isDigit(pas.charAt(i))) {
                    number = true;
                } else if (base.contains(Character.toString(pas.charAt(i)))) {
                    simvols = true;
                }
            }if(aper && lower && number && simvols) {
                System.out.println("nadezniy");
            }else {
                System.out.println("Nenadezny");
            }
        }


    }
}
