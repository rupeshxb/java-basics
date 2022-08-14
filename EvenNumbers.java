/* Program to print even numbers from 0 to 200 */

class EvenNumbers{
    public static void main(String args[])
    {
        int no=0;
        int count=1;
        System.out.println("The even numbers are:");
        do{
            no = count * 2;
            System.out.println(no);
            count++;
        }while(count<=100);
    }
}