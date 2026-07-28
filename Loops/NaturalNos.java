import java.io.*;
import java.util.*;
class NaturalNos{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            sum+=i;
        }
        System.out.println("The sum of the given natural no's is: "+ sum);
    }
}