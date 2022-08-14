class ForLoopExample{
    public static void main(String args[])
    {
        int count;
        for(count=1;count<=10;count++)
        {
            // System.out.println("Hello");
            if(count%2==0)
            {
                System.out.println(count +" is even");
            }
            else
            {
                System.out.println(count +" is odd");
            }
        }
    }
}