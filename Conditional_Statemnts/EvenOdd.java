import java.io.*;
import java.util.*;
class EvenOdd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        if(number%2==0)
        System.out.println("The given "+number+" is even number.");
        else
        System.out.println("The given "+number+" is odd number.");
    }
}