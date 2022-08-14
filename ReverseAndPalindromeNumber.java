import java.util.Scanner;

class ReverseAndPalindromeNumber{
    public static void main(String args[])
    {
        int num,temp,rem, sum=0;
        System.out.println("Enter the number.");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        temp = num;
        while(num>0)
        {
            rem = num%10;
            num = num/10;
            sum = (sum*10)+rem;
        }
        System.out.println("The reverse of a number " + temp + " is: " + sum);
        if(sum==temp)
        {
            System.out.println(temp + " is a palindrome number.");
        }
        else
        {
            System.out.println(temp + " is not a palindrome number.");
        }
    }
}