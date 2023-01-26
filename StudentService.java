import java.util.Arrays;
public class StudentService {
    public static Studentt bestStudent(Studentt[] students){
    Studentt beststudent = null;
    double averagesStudent= 0;
        for (int i = 0; i <students.length ; i++) {
            if(students[i].average()>averagesStudent){
                beststudent = students[i];
                averagesStudent = students[i].average();
            }
        }
        return beststudent;
    }
public static void sortBySurname(Studentt[] students){
    for (int i = 0; i < students.length-1; i++) {
        for (int j = 0; j < students.length-1-i; j++) {
            if(students[j].getSurName().compareTo(students[j+1].getSurName())>0){
              Studentt temp=students[j];
              students[j]= students[j+1];
              students[j+1]=temp;
            }
        }
    }
}
    public static void main(String[] args) {
       Studentt studentt=new Studentt();
       studentt.setSurName("popov");
       studentt.setName("vanya");
       studentt.setGrades(new int[]{1,2,5,4,6,3,9,7,8,10});
       Studentt studentt1=new Studentt();
        studentt1.setSurName("avolkov");
        studentt1.setName("dima");
        studentt1.setGrades(new int[]{2,3,1,10,5,41,6,3,9,8});
       Studentt studentt2=new Studentt();
        studentt2.setSurName("bobovich");
        studentt2.setName("senya");
        studentt2.setGrades(new int[]{20,3,1,10,5,41,6,3,9,8});
       Studentt [] nioviy= {studentt,studentt1,studentt2};
        System.out.println(bestStudent(nioviy));
        sortBySurname(nioviy);
        System.out.println(Arrays.toString(nioviy));
    }
}
//сортировка пузырьком вставками выбором