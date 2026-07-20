import java.io.*;
import java.util.*;
class Divisible{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        if(number%10 == 0 || number%10 == 5)
        System.out.println("The given "+number+" is divisible by 5.");
    }
}