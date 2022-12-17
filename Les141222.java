public class Les141222 {

    public static void main(String[] args) {
        isPolendrom("казак");
        System.out.println(isPolendrom("казах"));
    }

    public static boolean isPolendrom(String n) {
        if(n.length()<=1){
            return true;
        }
        //каззак
        if (n.charAt(0) != n.charAt(n.length() - 1)) {
            return false;
        }

        return isPolendrom(n.substring(1, n.length() - 1));
    }

}
////            for (int i = 0; i < n.length()/2 ; i++) {
////                if(n.charAt(i) != n.charAt(n.length()-1-i)){
////                    System.out.println("Ne polindrom");
////                    return false;
////                }
////            }
////            System.out.println("eto Polindrom");
////            return true;
//
//
////продумать как с помощью рекурсии я вляется ли рекурсией  .перерешать все 3 задачи рекурсии
//
