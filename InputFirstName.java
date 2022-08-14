import java.util.Scanner;

class InputFirstName{
    public static void main(String args[]){
        String name;
        // String fullName;
        System.out.println("Enter your name: ");
        Scanner x=new Scanner(System.in);
        name=x.nextLine();
        // fullName=x.nextLine();
        System.out.println("Your name is: " + name);
        // System.out.println("Your full name is:" + name + fullName);
    }
}