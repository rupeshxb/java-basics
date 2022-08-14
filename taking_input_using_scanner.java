import java.util.Scanner; // importing a package
class TakingInputUsingScanner{
    static int a;
    public static void main(String args[])
    {
        int x;
        int y;
        System.out.println("Enter the input value:");
        Scanner z=new Scanner(System.in); //System.in converts to string hence it needs to be converted to int
        y=z.nextInt();
    }
}