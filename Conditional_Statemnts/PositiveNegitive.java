import java.io.*;
import java.util.*;
class PositiveNegitive{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=sc.nextInt();
        if(number>0)
        System.out.println("The given number is positive.");
        else
        System.out.println("The given number is negitive.");
    }
}