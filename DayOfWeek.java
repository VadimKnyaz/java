public class DayOfWeek {
    byte dayNumber;
    String nameDay;
    DayOfWeek(byte dayNumber , String nameDay){
    this.dayNumber=dayNumber;
    this.nameDay= nameDay;
    }
    @Override
    public String toString(){
      return dayNumber +" "+nameDay;
    }
    public static void main(String[] args) {
       DayOfWeek [] dayOfWeek = new DayOfWeek[]{ new DayOfWeek((byte)1 ,"Monday"), new DayOfWeek((byte) 2,"Tuesday"),
               new DayOfWeek((byte)3, "Wednesday" ),new DayOfWeek((byte) 4 ,"Thursday"),
               new DayOfWeek((byte) 5,"Friday"), new DayOfWeek((byte) 6,"Saturday"),
               new DayOfWeek((byte) 7,"Sunday") };
        for (int i = 0; i <dayOfWeek.length ; i++) {
            System.out.println(dayOfWeek[i]);

        }

    }
}

