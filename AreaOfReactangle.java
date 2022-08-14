import java.util.Scanner;

class AreaOfRectangle{
    public static void main(String args[])
    {
        int area,l,b,h;
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the length:");
        l=x.nextInt();
        System.out.println("Enter the breadth:");
        b=x.nextInt();
        System.out.println("Enter the height:");
        h=x.nextInt();
        area=l*b*h;
        System.out.println("Area of rectangle is:"+area);
    }
}