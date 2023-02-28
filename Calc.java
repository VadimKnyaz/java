package kalc;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
calc();
    }
    public static void calc (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стартовое значение");
        double carent = Double.parseDouble(scanner.nextLine());
        while (true){
            System.err.println(carent);
            System.out.println("+ нажмите 1");
            System.out.println("- нажмите 2");
            System.out.println("* нажмите 3");
            System.out.println("/ нажмите 4");
            System.out.println("Сброс значения 5");
            System.out.println("ВЫход  6");
            System.out.println("Возведение в степень нажмите 7");
            System.out.println("Квадратный корень 8");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                System.out.println("Введите число с которым вы хотели сложить");
                carent = carent + Double.parseDouble(scanner.nextLine());
            } else if (choice.equals("2")) {
                System.out.println("Введите число из которого надо вычесть");
                carent = carent - Double.parseDouble(scanner.nextLine());
            } else if (choice.equals("3")) {
                System.out.println("Введитет число на которое надо умножить");
                carent = carent * Double.parseDouble(scanner.nextLine());
            } else if (choice.equals("4")) {
                System.out.println("Введите число на которое надо разделить");
                carent = carent / Double.parseDouble(scanner.nextLine());
            } else if (choice.equals("5")) {
                System.out.println("Введите новое значение");
                carent = Double.parseDouble(scanner.nextLine());
            } else if (choice.equals("6")) {
                break;
            } else if (choice.equals("7")) {
                System.out.println("Введите степень в которру вы хотите возвести число");
                int stepen = Integer.parseInt(scanner.nextLine()) ;
                double number = carent;
                for (int i = 1; i <stepen ; i++) {
                    carent = carent * number;
                }
            } else if (choice.equals("8")) {
                carent = Math.sqrt(carent);

            } else  {
                System.out.println("Net komandi");

            }
            System.out.println();
            System.out.println();

        }
        }
    }

