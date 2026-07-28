import java.io.*;
import java.util.*;
class Palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int rev=0;
        int temp=num;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;
        }
        System.out.println(rev);
        if(temp==rev){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    }
}