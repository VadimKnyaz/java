package YandexSprint1;

public class MonthToData {
    private final int[] days = new int[30];

    public int[] getDays() {
        return days;
    }
public void saveSteps(int steps, int day){
        days[day-1]=steps;

}

}
