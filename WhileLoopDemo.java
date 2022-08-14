import java.util.Scanner;

class WhileLoopDemo{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a character");
        char ans=x.next().charAt(0);

        while(ans!='q')
        {
            System.out.println("You have inserted character"+ans);
            System.out.println("try another character");
            ans=x.next().charAt(0); // charAt(n) gives the
        }
        System.out.println("correct character!");
    }
}