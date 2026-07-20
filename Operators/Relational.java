// ==,<,<=,>,>=,!=
import java.io.*;
import java.util.*;
class Relational{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1: ");
        int a=sc.nextInt();
        System.out.println("Enter num2: ");
        int b=sc.nextInt();
        if(a==b)
        System.out.println("true");
        else
        System.out.println("false");
        if(a<b)
        System.out.println("a is small");
        if(a>b)
        System.out.println("a is big");
        if(a<=b)
        System.out.println("a is less than or equal to b");
        if(a>=b)
        System.out.println("a is greater than or equal to b");
        if(a!=b)
        System.out.println("true");
        else
        System.out.println("false");
    }
}