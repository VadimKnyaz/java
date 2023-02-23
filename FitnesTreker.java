package fitnesTreker;

import java.util.Scanner;

public class FitnesTreker {
    //distanc m
    private int distanseMe;

    public void calculateLk() {
        System.out.println("Сожгли " + (distanseMe / 10));
    }

    public void resetDistanc() {
        distanseMe = 0;
    }
    public void indexMassiTela(int weightKg, double rostMet) {
        double indexMassiTela = weightKg / Math.pow(rostMet, 2);
        if (indexMassiTela < 18.5) {
            System.out.println("Дефицит массы тела");
        } else if (indexMassiTela > 18.5 && indexMassiTela < 30) {
            System.out.println("Норма");
        } else if (indexMassiTela > 30) {
            System.out.println("МногоОООО");
        }
    }

    public static void main(String[] args) {
        FitnesTreker fitnesTreker = new FitnesTreker();
        fitnesTreker.distanseMe=2000;
        Scanner scanner=new Scanner(System.in);
        fitnesTreker.calculateLk();
        //fitnesTreker.indexMassiTela(Integer.parseInt(scanner.nextLine()),Double.parseDouble(scanner.nextLine()));
    spam(scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
    }

    public static void spam (String textSpam, int counter){
        for (int i = 0; i <counter ; i++) {
            System.out.println(textSpam);
        }
    }
}