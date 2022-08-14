/* WAP to print sum of even number from 1 to 20*/
class EvenNumSum{
    public static void main(String args[])
    {
        int i,sum=0;

        for(i=1;i<=20;i++)
        {
            if(i%2==0)
            {
                sum+=i;
            }
        }
        System.out.println("Sum of even numbers from 1 to 20 is:"+sum);
    }
}