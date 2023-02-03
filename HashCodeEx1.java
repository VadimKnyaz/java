//package kollections;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Objects;
//
//public class HashCodeEx1 {
//    public static void main(String[] args) {
//        Map<Student,Double>map=new HashMap<>();
//        Student st1=new Student("Vadim","Knyazev",5);
//        Student st2=new Student("Demid","Knyazev",);
//        Student st3=new Student("Vadim","Knyazev",5);
//    }
//    class Student{
//        String name;
//        String surname;
//        int course;
//
//        public Student(String name, String surname, int course) {
//            this.name = name;
//            this.surname = surname;
//            this.course = course;
//
//
//        }
//
//        @Override
//        public String toString() {
//            return "Student{" +
//                    "name='" + name + '\'' +
//                    ", surname='" + surname + '\'' +
//                    ", course=" + course +
//                    '}';
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (!(o instanceof Student)) return false;
//            Student student = (Student) o;
//            return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
//        }
//
////        @Override
////        public int hashCode() {
////            return Objects.hash(name, surname, course);
////        }
//
//
//    }
//
//}
