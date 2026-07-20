import java.io.*;
import java.util.*;
class Positive{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        if(number>0)
        System.out.println("The given "+ number +" is a positive number");
    }
}