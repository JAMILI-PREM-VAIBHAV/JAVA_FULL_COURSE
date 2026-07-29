import java.io.*;
import java.util.*;
class Fibanocii{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n1: ");
        int n1=sc.nextInt();
        System.out.println("Enter the n2: ");
        int n2=sc.nextInt();
        System.out.println("Enter the number to print the series: ");
        int series=sc.nextInt();
        System.out.println("The fibanocii series upto given number is: ");
        for(int i=1;i<=series;i++){
            System.out.print(n1+" ");
            int next_sum=n1+n2;
            n1=n2;
            n2=next_sum;
        }
    }
}