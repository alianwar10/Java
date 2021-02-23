public class Casting {

    public static void main(String[] args)  {

        // Declare two integer variables and printing out their sum
        int firstValue = 90;
        int secondValue = 100;
        int totalValue = firstValue + secondValue;
        System.out.println(totalValue);

        /* Casting --> Converting a number from one type to another
           Create a variable of byte, but using int values for calculation
        */

       // byte someMoreCalculation = (totalValue / 2); --> this would return an error

        byte someMoreCalculation = (byte)(totalValue / 2);


    }
}
