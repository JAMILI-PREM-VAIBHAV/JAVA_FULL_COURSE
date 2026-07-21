import java.io.*;
import java.util.*;
class Calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a=sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b=sc.nextInt();
        System.out.println("Enter the arithmetic operator: ");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid Operator.");
        }
    }
}