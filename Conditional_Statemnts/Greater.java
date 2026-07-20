import java.io.*;
import java.util.*;
class Greater{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        if(a>b)
        System.out.println("a is big.");
        else
        System.out.println("b is big.");
    }
}