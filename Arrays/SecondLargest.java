import java.io.*;
import java.util.*;
class SecondLargest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        if(size<2){
            System.out.println("No largest element");
        }
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements before sorting are: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.println("Array elements after sorting: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=size-1;i>=0;i--){
            if(i==size-2){
                System.out.print(arr[i]);
            }
        }
    }
}