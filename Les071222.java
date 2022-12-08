import java.util.Scanner;

public class Les071222 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String[] norma = scanner.nextLine().trim().split(" ");
        int a =Integer.parseInt(norma[0]);
        int b =Integer.parseInt(norma[1]);
        int c =Integer.parseInt(norma[2]);
        int k =Integer.parseInt(norma[3]);
        int [][]nedelya= new int[7][4];
        for (int i = 0; i <7 ; i++) {
            String []temp =scanner.nextLine().trim().split(" ");
            for (int j = 0; j <4 ; j++) {
                nedelya[i][j]= Integer.parseInt(temp[j]);
            }
        }
        for (int i = 0; i <7 ; i++) {
            for (int j = 0; j <4 ; j++) {
                System.out.print(nedelya[i][j]);
            }
            System.out.println();
        }
        int asum = 0;
        int bsum = 0;
        int csum = 0;
        int ksum = 0;
        for (int i = 0; i <7 ; i++) {
            for (int j = 0; j <4 ; j++) {
                if(j==0){
                    asum+=nedelya[i][j];
                } else if (j==1) {
                    bsum+=nedelya[i][j];
                } else if (j==2) {
                    csum+=nedelya[i][j];
                } else if (j==3) {
                    ksum+=nedelya[i][j];
                }
            }
        }
        if(asum<a&&bsum<b&&csum<c&&ksum<k){
            System.out.println("otl");
        }else {
            System.out.println("nugno menhse");
        }
    }
}
//оптимизировать убрать много лишних циклов