import java.util.Scanner;

public class Session5 {

    public static void main(String[] args) {
        // h1 -- is called object reference
//        Human h1 = new Human("Anila", 20);
//        Human h2 = new Human("Akash",30);
//
//
//        h1.printDetails();
//        h2.printDetails();

        Box b1 = new Box(5,5,5);
        int volume = b1.getVolume();
        System.out.println(volume);
        Box b2 = new Box(10,10,10);

        System.out.println( b2.getVolume()  );

    }


    public static double sum(int a, double b) {
        return a+b;
    }
    // Write a method which returns true  if given number is even and divisible by 5.
    // else it should return false.
    // write a method which calulate a simple interest
    // intest = pricipal * rateOfinterest * time /100
            // pricipal = double
            // rateOfIntert = double
           // time = int

    /*
      Write a method which print a localized greeting
      method will recieve name of the person and lang code
       English = 1, Hindi = 2, Spanish =3 , French = 4,
       for unknown lang code, use english
       void printGreeting( "Atin" , 1) ==>  Hello Atin
        "Hello "+ name+ ",
        printGreeting( "Atin" , 2) ==>  Namaste Atin
     */


}
