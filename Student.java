public class Student {
    int age;
    int namberOfGrupp;
    int idStudent;
    String name;


    public static void main(String[] args) {
        Student student = new Student();
        student.idStudent = 12;
        student.age = 20;
        student.namberOfGrupp = 002;
        student.name = "Viktor";
        student.learn();
        student.speak("Priveeeeeeet");
        int kurs = student.numberKursa();
        System.out.println(kurs);
        System.out.println(student.isAdult());
    }

    public void learn() {
        System.out.println(name + " Pristupil k zanyatiu");

    }

    public void speak(String msg) {
        System.out.println(name + " Govorit " + msg);
    }

    public int numberKursa() {
        if (age == 17 || age == 18) {
            return 1;
        } else if (age == 19 || age == 20) {
            return 2;
        } else {
            return 3;
        }
    }
    public boolean isAdult(){
        if (age>18 ){
            return true;
        }else {
            return false;
        }
    }

}

