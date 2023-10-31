public class HelloWorld {

    public static void main(String[] args){
        //printing HelloWorld
        System.out.println("Hello World!");

        //1. int variable named myFavoriteNumber:
        int myFavoriteNumber = 8;
        System.out.println(myFavoriteNumber);

        //2. string variable named myString:
//        String myString = "Today is Halloween!";
//        System.out.println(myString);

        //3. assign character value to previous code:
//        char myString = "Today is Halloween!";
//        System.out.println(myString);

        //4. assign 3.14159 to myString:
        String myString = "3.14159";
        System.out.println(myString);

        //5. declare long variable named myNumber with nothing assigned to it:
//        long myNumber;
//        System.out.println(myNumber);

        //6. assign 3.14 to myNumber:
//        long myNumber = 3.14;
//        System.out.println(myNumber);

        //7. assign 123L to myNumber:
//        long myNumber = 123L;
//        System.out.println(myNumber);

        //8. assign 123 to myNumber:
//        int myNumber = 123;
//        System.out.println(myNumber);

        //9. refactor myNumber to float and assign 3.14:
//        float myNumber = 3.14;
//        System.out.println(myNumber);
        //two ways to fix the above code:
//        double myNumber = 3.14;
//        System.out.println(myNumber);
          String myNumber = "3.14";
        System.out.println(myNumber);

        //10. Copy and paste code blocks:
        int z = 5;
        System.out.println(z++);
        System.out.println(z);

        int b = 5;
        System.out.println(++b);
        System.out.println(b);
        //explanation: ++ increment

        //11. create a variable named class:
//        class class = "hello";

        //12. copy and paste code: Received error:"Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap') at HelloWorld.main(HelloWorld.java:64)"
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
        //Different code: Received error: java: incompatible types: java.lang.String cannot be converted to int"
//        int three = (int) "three";

        //13. Rewrite the following expressions using the relevant shorthand assignment operators:
//        int x = 4;
//        x = x + 5;
        //refactored:
//        int x =+ 4;
        //Another expression:
//         int x = 3;
//         int y = 4;
//         y = y * x;
//         y *= x;
//         System.out.println(y);
        int x = 10;
        int y = 2;
        x = x / y;
        y = y - x;
        y -= x;
        System.out.println(y);

        //14. Integer.MAX_VALUE
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);




    }
}
