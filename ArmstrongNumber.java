// armstrong number = the digit that is equal to the sum of cubes of its digit

import java.util.Scanner;
import java.lang.Math;

class ArmstrongNumber{
    public static void main(String args[])
    {
        int temp, num, rem;
        double sum=0;
        System.out.println("Enter the number");
        Scanner y = new Scanner(System.in);
        num = y.nextInt();
        temp = num;
        while(num>0){
            rem = num%10;
            num = num/10;
            // sum +=rem*rem*rem;
            sum += Math.pow(rem,3);
        }
        if(sum==temp){
            System.out.println("The digit " + temp + " is a armstrong number");
        }
        else
        {
            System.out.println("The digit " + temp + " is not a armstrong number");
        }
    }
}