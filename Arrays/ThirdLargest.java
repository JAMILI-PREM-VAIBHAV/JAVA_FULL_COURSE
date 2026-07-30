import java.io.*;
import java.util.*;
class ThirdLargest{
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
        Arrays.sort(arr);
        int largest=arr[size-1];
        int second_largest=arr[size-2];
        boolean found=false;
        System.out.println();
        for(int i=size-1;i>=0;i--){
            if(arr[i]!=largest && arr[i]!=second_largest){
                System.out.println(arr[i]);
                found=true;
                break;
            }
        }
    }
}