/* 

*  
* *
* * *
* * * *
* * * * *

*/

import java.util.*;

class PatternStarTriangle{
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=5;i++) // no of rows
        {
            for(j=1;j<=i;j++) // no of columns
            {
                System.out.print("* ");
            }
            System.out.println(" "); // go to next line after each row
        }
    }
}

