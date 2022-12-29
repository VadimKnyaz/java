import java.util.Arrays;

public class AmazingString {
    char[] arraychars;

    public AmazingString(char[] arraychars) {
        this.arraychars = arraychars;
    }

    public AmazingString(String str) {
        this.arraychars = str.toCharArray();

    }

    public char charAtByVadim(int index) {
        return arraychars[index];

    }

    public int lengthByVadim() {

        return arraychars.length;
    }

    public void printByvadim() {
        for (int i = 0; i < arraychars.length; i++) {
            System.out.print(arraychars[i]);
        }
        System.out.println();
    }

    public void toUpperCaseByVadim() {
        for (int i = 0; i < arraychars.length; i++) {
            arraychars[i] = Character.toUpperCase(arraychars[i]);
            //исправить мето чтобы изиенялось.прочитасть чтобы расказать что такое мьтебл инмютибл
        }
    }//мьютебл имутабле

    public void toLowwerCaseByVadim() {
        for (int i = 0; i < arraychars.length; i++) {
            arraychars[i] = Character.toLowerCase(arraychars[i]);
        }
    }

    public boolean containsByVadim(char[] array) {
        if (array.length > arraychars.length) {
            return false;
        }
        for (int i = 0; i < arraychars.length - array.length; i++) {
            for (int j = 0, k = i; j < array.length; j++, k++) {

                if (arraychars[k] != array[j]) {
                    break;
                }
                if (array.length - 1 == j) {
                    return true;//маким мтестить по дебагать этот метод понять будут исключения почему они вылетают где есть ошибка амазинг стринг передать строку дебагаеш смотриш дебаг освоить во внешнем цикле поломать голову г де фолс и где итерироваться
                }
            }//HhaiohaiHello
        }
        return false;
    }

    public boolean containsByVadim(String substring) {
        char[] subsrtring = substring.toCharArray();
        if (substring.length() > arraychars.length) {
            return false;
        }
        for (int i = 0; i < arraychars.length - subsrtring.length; i++) {
            for (int j = 0, k = i; j < substring.length(); j++, k++) {
                if (arraychars[k] != subsrtring[j]) {
                    break;
                }
                if (substring.length() - 1 == j) {
                    return true;//маким мтестить по дебагать этот метод понять будут исключения почему они вылетают где есть ошибка амазинг стринг передать строку дебагаеш смотриш дебаг освоить во внешнем цикле поломать голову г де фолс и где итерироваться
                }
            }//HhaiohaiHello
        }
        return false;
    }

    public void reverse() {
        for (int i = 0; i < arraychars.length / 2; i++) {
            char temp = arraychars[i];

            arraychars[i] = arraychars[arraychars.length - 1 - i];
            arraychars[arraychars.length - 1 - i] = temp;
//            arraychars[i]=arraychars[arraychars.length-1-i];
//            arraychars[arraychars.length-1-i]= temp;
            //   arraychars[тут индекс ктр изначально последний но с каждой итерациие будет стремиться влево к нулевому .lenght (n-1)0]=
        }
    }

    public void trimByVadim() {
        //"  Hello  World  "   "Hello  World"
        //найти первый символ не пробел и отрезать всё что до первого пробела
        ///найти последний  символ не пробел и отрезать всё что после него
        int startindex = 0;
        int endindex = lengthByVadim() - 1;
        for (int i = 0; i < lengthByVadim(); i++) {
            if (arraychars[i] != ' ') {
                startindex = i;
                break;
            }
        }
        for (int i = lengthByVadim() - 1; i >= 0; i--) {
            if (arraychars[i] != ' ') {
                endindex = i;
                break;
            }
        }
        char[] newarray = new char[endindex - startindex+1];
        int index=0;
        for (int i = startindex; i <= endindex; i++) {
            newarray[index] =arraychars[i];
          index++;
        }
        arraychars = newarray;
    }
    public static void main(String[] args) {
        AmazingString amazingString = new AmazingString("   Hello    ");
        //      System.out.println(amazingString.charAtByVadim(2));
//        amazingString.printByvadim();
//        amazingString.toUpperCaseByVadim();
//        amazingString.printByvadim();
//        amazingString.toLowwerCaseByVadim();
//        amazingString.printByvadim();
//        String st = "aabbb";
        //      System.out.println(amazingString.containsByVadim(new char[]{'e','l','o'}));
        //     System.out.println(amazingString.reverse(new char[]{'e','l','o','l','a'}));
        amazingString.trimByVadim();
        amazingString.printByvadim();

//        int[]arra={1,3,5,9};
//        System.out.println(arra[1]);
    }
}
//считывание из файла и запись в файл