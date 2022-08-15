import java.util.*;
import java.lang.*;

class SelectMathOperation{
    public static void main(String args[])
    {
        int a,b;
        int choice,add,diff;
        char opt,option;
        Scanner x = new Scanner(System.in); 
        do{
        System.out.println("Enter any two numbers for operation");
        a=x.nextInt();
        b=x.nextInt();
        System.out.println("Enter 1 for add, 2 for sub, 3 for multiplication");
        choice = x.nextInt();
        switch(choice){
            case 1:
                add = a+b;
                System.out.println("The sum of two numbers:"+add);
                break;
            case 2:
                diff = a-b;
                System.out.println("The difference of two numbers:"+diff);
                break;
        } 
        System.out.println("Do you want to continue? Enter N to discontinue");
        // option = x.nextInt();
        opt = x.next().charAt(0);
        option = Character.toUpperCase(opt);
        }while(option!='N'); // && opt!='n'
        
    }
}