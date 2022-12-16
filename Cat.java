import java.util.Random;

public class Cat {

    private void sleep() {
        System.out.println("Sleep");
    }
    private void meow() {
        System.out.println("Meow");
    }
    private void eat () {
        System.out.println("Eat");
    }
    public void status(){
       int ran;
       Random random = new Random();
       ran = random.nextInt(3);

       if(ran==0){
          sleep();
       }else if(ran == 1){
           meow();
       } else if (ran==2) {
           eat();
       }
    }

    public static void main(String[] args) {
        Cat cat =new Cat();
        cat.status();

    }
}
