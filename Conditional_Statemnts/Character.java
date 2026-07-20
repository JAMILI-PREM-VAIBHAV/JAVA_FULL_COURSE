import java.io.*;
import java.util.*;
class Character{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch=sc.next().charAt(0);
        int a=(int)ch;
        System.out.println(a);
        if(a>=65 && a<=90)
        System.out.println("It is a Uppar case letter.");
    }
}