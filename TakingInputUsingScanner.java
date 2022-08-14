import java.util.Scanner; // importing a package, util is a package, Scanner is a class

class TakingInputUsingScanner{
    static int a;
    public static void main(String args[])
    {
        int x;
        int n1,n2,sum;
        System.out.println("Enter the input value:");
        Scanner z=new Scanner(System.in); 
        // A new object z is created here using class "Scanner".
        // System.in converts to string hence it needs to be converted to int
        n1=z.nextInt(); 
        n2=z.nextInt();
        sum = n1+n2;
        // The above is analogous to creating a method nextInt() with object 'z'
        System.out.println(sum);
    }
}