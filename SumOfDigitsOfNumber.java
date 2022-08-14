import java.util.Scanner;

class SumOfDigitsOfNumber{
    public static void main(String args[])
    {
        int temp, num, rem, sum=0;
        System.out.println("Enter the number");
        Scanner y = new Scanner(System.in);
        num = y.nextInt();
        temp = num;
        while(num>0){
            rem = num%10;
            num = num/10;
            sum +=rem;
        }
        System.out.println("The sum of digits of the number " + temp + " is: " + sum);
    }
}