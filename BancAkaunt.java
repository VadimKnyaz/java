import java.util.ArrayList;
import java.util.Scanner;

public class BancAkaunt {
    private int id;
    private static int generationId;
    private double balance;
    private static double interestRate = 0.02;

    public BancAkaunt() {
        id = ++generationId;
    }

    @Override
    public String toString() {
        return "BancAkaunt{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }

    public static void setInterestRate(double interestRate) {
        BancAkaunt.interestRate= interestRate;
    }

    public double getInterest(int years,int sum) {
return sum*interestRate*years;
    }

    public void deposit(double amount) {
this.balance =this.balance+amount;

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <BancAkaunt> akaunts=new ArrayList<>();
        while (true){
          String comand = scanner.nextLine();
          switch (comand) {
              case "Create":
                  BancAkaunt bancAkaunt = new BancAkaunt();
                  System.out.println("Akkaunt uspechno cozdan");
                  akaunts.add(bancAkaunt);
                  break;
              case "SetInterestRate":
                  System.out.println("VVedite procentnuyu stavku");
                  setInterestRate(Double.parseDouble(scanner.nextLine()));
                  break;
              case "GetInterest"://предложить все счета , пользователь выберет счет ,запросить сумму,
                  System.out.println("Viberite chet");
                  for (int i = 0; i <akaunts.size() ; i++) {
                      System.out.println(i+1+" " + akaunts.get(i));
                  }
                  int ackoutNumber = Integer.parseInt(scanner.nextLine())-1;
                  System.out.println("Vvedite summu");
                  int sum = Integer.parseInt(scanner.nextLine());
                  System.out.println("vvedite kolichestvo let");
                  int years = Integer.parseInt(scanner.nextLine());
                  double profit = akaunts.get(ackoutNumber).getInterest(years,sum);
                  akaunts.get(ackoutNumber).deposit(profit+sum);
                  break;
              case "Deposit":
                  System.out.println("Viberite cset:");
                  for (int i = 0; i <akaunts.size() ; i++) {
                      System.out.println(i+1+" "+ akaunts.get(i));
                  }
                  int ackountNumber=Integer.parseInt(scanner.nextLine())-1;
                  System.out.println("Kakuyu sumu hotite vnesti? balanse :"+akaunts.get(ackountNumber).balance);
                  int sumDeposit= Integer.parseInt((scanner.nextLine()));
                  akaunts.get(ackountNumber).deposit(sumDeposit);
                  break;
              case "info":
                  for (int i = 0; i <akaunts.size() ; i++) {
                      System.out.println(i+1+" "+ akaunts.get(i));
                  }
                  break;
              case "End":
                  break;
          }


          }
        }

    }

