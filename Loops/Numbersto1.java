import java.io.*;
import java.util.*;
class Numbersto1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num value: ");
        int num=sc.nextInt();
        System.out.println("The numbers from num to 1: ");
        for(int i=num;i>=1;i--){
            System.out.println(i);
        }
    }
}