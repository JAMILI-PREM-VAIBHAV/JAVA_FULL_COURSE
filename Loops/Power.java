import java.io.*;
import java.util.*;
class Power{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        System.out.println("Enter the power: ");
        int pow=sc.nextInt();
        //int res=1;
        /*for(int i=1;i<=pow;i++){
            res=res*num;
        }
        System.out.println(res);*/
        double res=Math.pow(num,pow);
        System.out.println(res);
    }
}