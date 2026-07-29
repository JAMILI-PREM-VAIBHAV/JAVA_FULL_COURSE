import java.io.*;
import java.util.*;
class LinearSearch{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter target element: ");
        int target=sc.nextInt();
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int flag=0;
        for(int i=0;i<size;i++){
            if(arr[i]==target)
            flag=1;
        }
        if(flag==1)
        System.out.println("Element is found.");
        else
        System.out.println("Element is not found.");
    }
}