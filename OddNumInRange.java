/* WAP to print odd number from 50 to 100*/
class OddNumInRange{
    public static void main(String args[])
    {
        int i;
        for(i=50;i<=100;i++)
        {
            if(i%2!=0)
            {
                System.out.println(i + " is odd");
            }
        }
    }
}