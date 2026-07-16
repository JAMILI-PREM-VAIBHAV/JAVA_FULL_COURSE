// &&,||,!
import java.io.*;
import java.util.*;
class Logical{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age=sc.nextInt();
        System.out.println("Enter citizenship: ");
        String citizen=sc.next();
        if(age>=18 && citizen.equals("India"))
        System.out.println("Eligible to vote");
        else
        System.out.println("Not eligible to vote");
    }
}