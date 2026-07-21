import java.io.*;
import java.util.*;
class Electricity{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the units: ");
        int units=sc.nextInt();
        if(units==100)
        System.out.println(units*2);
        else if(units<=200 && units>=101)
        System.out.println(units*3);
        else
        System.out.println(units*5);
    }
}