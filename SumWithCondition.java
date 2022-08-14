import java.util.*;

class SumWithCondition{
    public static void main(String args[]){
        Scanner y=new Scanner(System.in);
        int sum=0, no;
        do{
            System.out.println("Enter a non-negative number");
            no=y.nextInt();
            if(no<0){
                sum=sum;
                System.out.println("The sum of number is:" + sum);
            }
            else{
                sum=sum+no;
                System.out.println("The sum of number is:" + sum);
            }    
        }while(no>=0);
        System.out.println("Oops!negative number detected");
    }
}