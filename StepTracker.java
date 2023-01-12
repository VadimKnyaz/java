package YandexSprint1;

import java.util.Scanner;

public class StepTracker {
    //    функционал:
//Консольный интерфейс для управления программой;-Ввести количество шагов за определённый день;Напечатать статистику за определённый месяц;Изменить цель по количеству шагов в день;Выйти из приложения
//Хранение данных о количестве пройденных шагов за несколько месяцев;
//Ввод вашей цели по количеству шагов в день;
//Ввод пройденного количества шагов за день;
//Вывод статистики за определённый месяц.
    private int goal = 10000;
    MonthToData[] monthToData = new MonthToData[12];

    public StepTracker() {
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthToData();

        }
    }

    public void stepsDay(int month, int day, int steps) {
        monthToData[month - 1].saveSteps(steps, day);
    }

    public void setGoal(int goal) {
        if (goal < 0) {
            System.out.println("Введённое значение отрицательное, значение не должно быть отрицательным");
            return;
        }
        this.goal = goal;
    }

    public int getGoal() {
        return goal;
    }

    public void statistika(int monthOfNumber) {
        //Количество пройденных шагов по дням в следующем формате:
        //1 день: 3000, 2 день: 2000, ..., 30 день: 10000

        //Общее количество шагов за месяц;
        //Максимальное пройденное количество шагов в месяце;
        //Среднее количество шагов;
        //Пройденная дистанция (в км);
        //Количество сожжённых килокалорий;
        //Лучшая серия: максимальное количество подряд идущих дней, в течение которых количество шагов за день было равно или выше целевого.
        int[] month = monthToData[monthOfNumber - 1].getDays();
        int sum = 0;
        int max = 0;
        int bestStreak = 0;//Лучшая серия;
        int streak = 0;//текущая серия

//10000 11000 0 11000 11000 11000
        for (int i = 0; i < 30; i++) {
            if (i % 5 == 0) {
                System.out.println();
            }
            sum = sum + month[i];
            if (month[i] > max) {
                max = month[i];
            }
            if (month[i] >= goal) {
                streak++;
                if(streak>bestStreak){
                    bestStreak= streak;
                }
            }else {
                streak=0;
            }

            System.out.print(1 + i + " Den: " + month[i] + ", ");

        }

        System.out.println();
        System.out.println("Общее количество шагов за месяц " + sum);
        System.out.println("Максимальное пройденное количество шагов в месяце " + max);
        System.out.println("Среднее количество шагов " + sum / 30);
        System.out.println("Пройденная дистанция (в км)" + Convertor.stepsToKm(sum));
        System.out.println("Количество сожжённых килокалорий" + Convertor.stepsToKkal(sum));
        System.out.println("Лучшая серия: максимальное количество подряд идущих дней, в течение которых количество шагов за день было равно или выше целевого "+bestStreak);

    }
}




