/*
A  
B C
D E F
G H I J
*/


    import java.util.*;

    class PatternAlphabetWithIncrementAlternative{
        public static void main(String args[])
        {
        int num_for_a = 65;
        int i,j;
        char ch='A';
            for (i=1;i<=4;i++)
            {
                for(j=1;j<=i;j++)
                {
                    System.out.print(ch++ + " "); 
                }
                System.out.println(" ");
            }
        }
    }

    // In this program, ch='A' and simply increment by c++ also works. i.e. increment of character value yie