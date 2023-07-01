import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ATM {
    public static double bankAcc = 0;
    public static double plusingMoney;
    public static int accRandom = (int) (Math.random()*200000 - 10000);;
    public static String bankName ="#" + accRandom;
    public static void main(String[] args) {
        askCLient();
    }
    public static void askCLient(){
        System.out.println("Your bank account number : " + bankName);

    }
    private static void askOperations(){
        System.out.println("Choose number of operation what you want to do.");
        System.out.println("1.Cash Out.");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    }
}
