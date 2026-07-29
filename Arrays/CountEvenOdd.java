import java.io.*;
import java.util.*;
class CountEvenOdd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        int even_count=0;
        int odd_count=0;
        System.out.println();
        System.out.println("The count of even elements and odd elements is: ");
        for(int i=0;i<size;i++){
            if(arr[i]%2==0)
            even_count++;
            else
            odd_count++;
        }
        System.out.println("Even_count is: "+even_count);
        System.out.println("Odd_count is: "+odd_count);
    }
}