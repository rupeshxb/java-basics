/*
Program to print following
1
2 3
4 5 6
7 8 9 10
*/ 

    import java.util.*;

    class PatternNumberIncrement{
        public static void main(String args[])
        {
        int i,j,num=1;
            for (i=1;i<=4;i++)
            {
                for(j=1;j<=i;j++)
                {
                    System.out.print(num+" ");
                    num++;
                }
                System.out.println(" ");
            }
        }
    }