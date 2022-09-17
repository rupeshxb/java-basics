class TypesOfVariable{
    int x=5; // instance variable
    static int y; // static variable

    public static void main(String args[]){
        int z=10; // local variable

        System.out.println("Value of non-static instance variable:" + x); 

        /* Non-static instance variable cannot be accessed from a static context. 
        Hence, x can't be accessed here. */

        System.out.println("Value of instance variable:" + y);
        System.out.println("Value of local variable is:" + z);
    }

}