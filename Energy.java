/*
* The "Energy" program, just proves you can show print to terminal.
*
* @author  Haokai
* @version 1.0
* @since   2021-11-20
*/

import java.util.Scanner;

/**
* This is the standard "Energy" program.
*/
final class Energy {

    /**
    * C power two variable.
    */
    public static final double CTWO = 2.998 * Math.pow(10, 8);

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Energy() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        try {
            // set answer
            final double myAnswer;
            // input
            System.out.print("Enter the mass of an objact in kilograms: ");
            final Scanner myObj = new Scanner(System.in);
            // set mass
            final float mass = myObj.nextFloat();
            // calculate
            myAnswer = mass * Math.pow(CTWO, 2);
            // output
            System.out.println(mass + "kg of mass would produce " + myAnswer
                + "J of energy.");
        }
        catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        System.out.println("\nDone.");
    }
}
