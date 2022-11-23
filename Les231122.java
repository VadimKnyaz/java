public class Les231122 {
    public static void main(String[] args) {
toMoorse("KJKGHKJHFUFGV");
    }
public static void toMoorse (String s){
        String[] morseBaza = {".-", "-...", ".--", "--.", "-..", ".", "...-", "--..", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", ".-.",
                "...", "-", "..-", "..-.", "....", "-.-.", "---.", "----", "--.-", "--.--", "-.--", "-..-", "..-..", "..--", ".-.-"};
        String alfaVit = "АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String input = s.toUpperCase();//ПУТЯ
        String hraniliche = "";
    for (int i = 0; i <input.length() ; i++) {
        int index = alfaVit.indexOf(input.charAt(i));
        if(index>0){
            hraniliche +=  morseBaza [index]+" ";
        }else {
          hraniliche +=" ";
        }
            }
    System.out.println(hraniliche);
}

}

