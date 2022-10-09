public class Lesson12 {
    public static void main(String[] args) {
        int []array1=  new int[5];
        array1[0]=1;
        array1[1]=2;
        array1[2]=3;
        array1[3]=4;
        array1[4]=5;
        String[] st =new  String[2];
        st[0]="st";
        st[1]="s";
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = array1.length-1 ; i >= 0 ; i--) {//4; 4 >0 ? ; 4--
            System.out.print(array1[i] + " ");

        }
        System.out.println();
        for (int i = 0; i <array1.length ; i++) {
            if(array1[i]%2!=0 ){
                System.out.println(array1[i] +"Nechetniy");
            }else {
                System.out.println(array1[i] +"Chetnoe");
            }

        }
        for (int i = 0; i <array1.length ; i+=2) {
            System.out.println(array1[i]);


        }
    }
}
