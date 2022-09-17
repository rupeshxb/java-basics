import java.util.*;
// load all classes of util package that consists of class Scanner used to take input

class AddTwoInputNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        /* creating an object sc using Scanner class by creating a
        constructor Scanner with its argument as System.in.
        System.in is used for input output stream */
        System.out.println("Enter the values of two number:");
        int n1 = sc.nextInt(); 
        int n2 = sc.nextInt();
        int sum = n1+n2;
        System.out.println("The sum of two numbers is:" + sum);
    }
}