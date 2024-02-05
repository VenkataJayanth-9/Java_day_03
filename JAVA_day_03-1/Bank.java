//What are the things that are in the bank.
/*
1.Bank account number.
2.Phone number.
3.pin number.
4.withdrawl, deposit
5. check balance.
 */


import java.util.Optional;

public class Bank {


    public String getOperation(String Operation, int amount)
    {
        if(Operation == "withdraw")
        {
            Total = Total - amount;
            System.out.println("You current balance = " + Total);
        }
        else if(Operation == "deposit")
        {
            Total = Total + amount;
            System.out.println("Your current balance = " + Total);
        }
        else
        {
            System.out.println("Invalid input!!");
        }
        return Operation;
    }

    private int Total = 10_000;


    public void setOperation(String operation) {
        Operation = operation;
    }

    private String Operation;



}
