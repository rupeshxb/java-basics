/*
A  
B C
D E F
G H I J
*/


    import java.util.*;

    class PatternAlphabetWithIncrement{
        public static void main(String args[])
        {
        int num_for_a = 65;
        int i,j;
        // convert int to char
        // typecasting
        char char_converted = (char)num_for_a;
            for (i=1;i<=4;i++)
            {
                for(j=1;j<=i;j++)
                {
                    System.out.print(char_converted++ + " "); 
                }
                System.out.println(" ");
            }
        }
    }

    // In this program, ch='A' and simply increment by c++ also works. i.e. increment of character value yie