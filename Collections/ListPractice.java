import java.io.*;
import java.util.*;
class ListPractice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);

        //Iterating by using for loop
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //For each loop
        for(int num:list){
            System.out.print(num+" ");
        }
        System.out.println();

        //Iterator
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        //ListIterator
        ListIterator<Integer> li=list.listIterator();
        while(li.hasNext()){
            System.out.print(li.next()+" ");
        }
        System.out.println();

        while(li.hasPrevious()){
            System.out.print(li.previous()+" ");
        }
        System.out.println();
    }
}