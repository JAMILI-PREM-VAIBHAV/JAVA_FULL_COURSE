import java.io.*;
import java.util.*;
class LoginSystem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the username: ");
        String username=sc.next();
        System.out.println("Enter the password: ");
        int password=sc.nextInt();
        if(username.equals("PremVaibhav")){
            if(password==7118){
                System.out.println("Hello, Welcome to kaboom.");
            }
            else
            System.out.println("Invalid Password.");
        }
        else{
            System.out.println("Invalid Username.");
        }
    }
}