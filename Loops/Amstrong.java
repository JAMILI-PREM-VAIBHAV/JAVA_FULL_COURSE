import java.io.*;
import java.util.*;
class Amstrong{
    public static void main(String argss[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        System.out.println("Enter the power: ");
        int pow=sc.nextInt();
        int temp=num;
        double res=0;
        while(num!=0){
            int digit=num%10;
            res=res+Math.pow(digit,pow);
            num/=10;
        }
        System.out.println(res);
        if(temp==res)
        System.out.println("Amstrong Number");
        else
        System.out.println("Not Amstrong Number");
    }
}