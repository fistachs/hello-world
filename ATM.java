import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class ATM {
    public static double balance = 0;
    public static double plusingMoney;
    public static int accRandom = (int) (Math.random()*200000 - 10000);;
    public static String bankName ="#" + accRandom;
    public static String readOperation;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     static String atm = "\uD83C\uDFE7";
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome in fistachsATM"+atm);
        System.out.println("Your bank account number : " + bankName);
        askOperations();
    }
    public static void askOperations() throws IOException {
        System.out.println("Choose number of operation what you want to do.");
        System.out.println("1.Cash-In.");
        System.out.println("2.Check balance.");
        System.out.println("3.Cash-Out.");
        System.out.println("4.Exit.");
        readOperation = reader.readLine();
        chooseOperation();
    }
    private static void chooseOperation() throws IOException {
        if(readOperation.equalsIgnoreCase("1")){
            System.out.println("Now your balance is "+ balance+" euro");
            System.out.println("Please put your money in slot below,write how much you want to insert.");
            double insertMoney = Double.parseDouble(reader.readLine());
            System.out.println("You putted "+insertMoney + " into your bank acccount.");
            balance =+ insertMoney;
            System.out.println("Now your balance : "+ balance+" euro");
            continueOp();
        }else if(readOperation.equalsIgnoreCase("2")){
            System.out.println("Now your balance : "+ balance+" euro");
            continueOp();
        }

    }
    public static void continueOp() throws IOException {
        System.out.println("Do you want to continue or exit?");
        String answer = reader.readLine();
        if(answer.equalsIgnoreCase("continue")){
            askOperations();
        }else if(answer.equalsIgnoreCase("exit")){
            return;
        }
    }
}
