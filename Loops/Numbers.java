import java.io.*;
import java.util.*;
class Numbers{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int num=sc.nextInt();
        System.out.println("The numbers upto a given number: ");
        for(int i=1;i<=num;i++){
            System.out.println(i);
        }
    }
}