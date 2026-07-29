import java.io.*;
import java.util.*;
class CopyArray{
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
        System.out.println();
        int copyarr[]=new int[size];
        for(int i=0;i<size;i++){
            copyarr[i]=arr[i];
        }
        System.out.println("Copy of array is: ");
        for(int i=0;i<size;i++){
            System.out.print(copyarr[i]+" ");
        }
    }
}