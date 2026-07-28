import java.io.*;
import java.util.*;
class Multiplication{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the table no you want: ");
        int table=sc.nextInt();
        System.out.println("Enter the number you want: ");
        int num=sc.nextInt();
        System.out.println("The table is: ");
        for(int i=1;i<=num;i++){
            System.out.println(table + " * " + i + " = " + (table * i));
        }
    }
}