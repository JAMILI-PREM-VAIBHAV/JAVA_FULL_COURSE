import java.io.*;
import java.util.*;
class StudentGrade{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks=sc.nextInt();
        if(marks<=100 && marks>=90)
        System.out.println("A grade");
        else if(marks<=89 && marks>=80)
        System.out.println("B grade");
        else if(marks<=79 && marks>=70)
        System.out.println("C grade");
        else if(marks<=69 && marks>=60)
        System.out.println("D grade");
        else
        System.out.println("Fail");
    }
}