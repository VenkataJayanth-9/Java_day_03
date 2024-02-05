import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Bank bank = new Bank();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your account number: ");
        int acc = sc.nextInt();
        System.out.print("Enter your mobile number: ");
        int phoneNo = sc.nextInt();
        System.out.print("Enter your pin number: ");
        int pin = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter withdraw for withdrawing money and deposit for adding money to your account: ");
        String oper = sc.nextLine();
        if (oper.equals("withdraw") || oper.equals("deposit"))
        {
            System.out.println("Enter amount: ");
            int amount = sc.nextInt();
            bank.getOperation(oper, amount);
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}
