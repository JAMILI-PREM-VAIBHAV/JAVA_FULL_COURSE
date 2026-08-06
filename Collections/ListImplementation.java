import java.io.*;
import java.util.*;
class ListImplementation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        //1.add(element);
        list.add(10);
        list.add(20);
        list.add(30);

        //2.add(index,element);
        list.add(3,40);
        list.add(4,50);
        System.out.println(list);

        //3.get(index);
        System.out.println(list.get(4));
        System.out.println(list.get(2));
        System.out.println(list);

        //4.set(index,element);
        list.set(0,100);
        list.set(1,200);
        list.set(2,300);
        list.set(3,400);
        list.set(4,500);
        System.out.println(list);

        //5.remove(index);
        list.remove(0);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

        //6.remove(Integer.valueOf(element));
        System.out.println(list);
        list.remove(Integer.valueOf(400));
        System.out.println(list);
        
        //7.Boxing(Primitive to Object)
        int a=10;
        Integer b=Integer.valueOf(10);

        //8.Unboxing(Object to Primitive)
        Integer c=10;
        int d=c.intValue();

        //9.AutoUnBoxing
        int p=40;
        Integer v=p;

        //10.contains(element)
        System.out.println(list.contains(500));
        System.out.println(list.contains(50));

        //11.indexOf(element);
        System.out.println(list.indexOf(200));

        //12.lastIndexOf(element)
        // It returns the last indexed value of that element when they are more than one time
        list.add(2,500);
        System.out.println(list);
        System.out.println(list.lastIndexOf(500));

        //13.isEmpty();
        System.out.println(list.isEmpty());
        
        //14.size()
        System.out.println(list.size());

        //15.clear();
        list.clear();
        System.out.println(list);

    }
}