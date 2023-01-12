package YandexSprint1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StepTracker stepTracker= new StepTracker();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite Imya");
        System.out.println("Privet");
        String name = scanner.nextLine();
        loop:
        while (true){
            printMenu();
            String choice=scanner.nextLine();
            switch (choice){
                case "1":
                    System.out.println("Vvedite mesyac , den, kol-vo chagov v formate:10 20 1000");
                    String [] data=scanner.nextLine().trim().split(" ");
                    int month = Integer.parseInt(data[0]);
                    int days = Integer.parseInt(data[1]);
                    int steps = Integer.parseInt(data[2]);
                    stepTracker.stepsDay(month,days,steps);

                    break;
                case "2":
                    System.out.println("VVedite mecyac ");
                    int choice2 = Integer.parseInt(scanner.nextLine());
                    stepTracker.statistika(choice2);
                    break;
                case "3":
                    System.out.println("VVedite novoe kolishestvo shagov");
                    stepTracker.setGoal(Integer.parseInt(scanner.nextLine()));
                    System.out.println("Novaya cell:"+stepTracker.getGoal());
                    break;
                case "4":
                    break loop;
            }
        }

    }
    private static void printMenu(){
        System.out.println("1 Ввести количество шагов за определённый день;\n" +
                "2 Напечатать статистику за определённый месяц;\n" +
                "3 Изменить цель по количеству шагов в день;\n" +
                "4 Выйти из приложения");
    }

}
