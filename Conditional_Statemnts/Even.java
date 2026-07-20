import java.io.*;
import java.util.*;
class Even{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number=sc.nextInt();
        if(number%2==0)
        System.out.println("The given "+number+" is a even number.");
    }
}