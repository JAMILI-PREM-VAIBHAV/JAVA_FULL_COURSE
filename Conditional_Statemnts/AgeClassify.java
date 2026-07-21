import java.io.*;
import java.util.*;
class AgeClassify{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age=sc.nextInt();
        if(age<=12 && age>=1)
        System.out.println("Child");
        else if(age>=13 && age<=19)
        System.out.println("Teenage");
        else if(age>=20 && age<=30)
        System.out.println("Adukt");
        else
        System.out.println("Senior Citizen");
    }
}