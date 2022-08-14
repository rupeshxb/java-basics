import java.util.Scanner;
class MaxBetweenTwoNum{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter two numbers");
        System.out.println("Enter the first number");
        int n1 = x.nextInt();
        System.out.println("Enter the second number");
        int n2 = x.nextInt();
        if(n1>n2)
        {
            System.out.println(n1+" is maximum number");
        } 
        else
        {
            System.out.println(n2+" is maximum number");
        }
    }
}