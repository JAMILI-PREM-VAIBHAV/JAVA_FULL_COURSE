import java.io.*;
import java.util.*;
class Even{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num value: ");
        int num=sc.nextInt();
        System.out.println("Even numbers upto given range are: ");
        for(int i=2;i<=num;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}