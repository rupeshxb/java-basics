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
        int num_ascii = 65;
        int i,j;
            for (i=1;i<=4;i++)
            {
                for(j=1;j<=i;j++)
                {
                    char char_converted = (char)num_ascii;
                    // typecasting int to char
                    System.out.print(char_converted + " "); 
                    num_ascii++;
                }
            }
        }
    }

    // In this program, ch='A' and simply increment by c++ also works. i.e. increment of character value yie