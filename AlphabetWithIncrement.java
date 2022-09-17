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
        int num = 65; // this is the ascii value for Capital 'A'
        int i,j;
        char char_converted = (char)num; // typecasting int to char
            for (i=1;i<=4;i++)
            {
                for(j=1;j<=i;j++)
                {
                    System.out.print(char_converted+ " ");
                    char_converted++;
                }
                System.out.println(" ");
            }
        }
    }