import java.io.*;
import java.util.*;
class Atm{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the pin: ");
        int pin=sc.nextInt();
        System.out.println("Enter the balance: ");
        int balance_amnt=sc.nextInt();
        if(pin==12345){
            System.out.println("Enter the withdrawl amount: ");
            int withdrawl_amnt=sc.nextInt();
            if(withdrawl_amnt<=balance_amnt){
                System.out.println("Your amount is going to withdrawl.");
            }
            else{
                System.out.println("Balance amount is not sufficient.");
            }
        }
        else{
            System.out.println("Invalid pin.");
        }
    }
}