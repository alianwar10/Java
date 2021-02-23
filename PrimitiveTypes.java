public class PrimitiveTypes {

    // Primitive types are the most basic data types

    public static void main(String [] args) {

            byte myMaxByteValue = Byte.MAX_VALUE;
            byte myMinByteValue = Byte.MIN_VALUE;
            System.out.println(myMaxByteValue);
            System.out.println(myMinByteValue);

            short myMaxShortValue = Short.MAX_VALUE;
            short myMinShortValue = Short.MIN_VALUE;
            System.out.println(myMaxShortValue);
            System.out.println(myMinShortValue);

            int myMaxIntegerValue = Integer.MAX_VALUE;
            int myMinIntegerValue = Integer.MIN_VALUE;
            System.out.println(myMaxIntegerValue);
            System.out.println(myMinIntegerValue);

            long myMaxLongValue = Long.MAX_VALUE;
            long myMinLongValue = Long.MIN_VALUE;
            System.out.println(myMaxLongValue);
            System.out.println(myMinLongValue);

            double myMaxDoubleValue = Double.MAX_VALUE;
            double myMinDoubleValue = Double.MIN_VALUE;
            System.out.println(myMaxDoubleValue);
            System.out.println(myMinDoubleValue);

            float myMaxFloatValue = Float.MAX_VALUE;
            float myMinFloatValue = Float.MIN_VALUE;
            System.out.println(myMaxFloatValue);
            System.out.println(myMinFloatValue);

            // Primitive Type Challenge

            byte myByteValue = 10;
            short myShortValue = 20;
            int myIntValue = 50;
            long totalValue = 50000 + 10 * (myByteValue + myShortValue + myIntValue);
            System.out.println(totalValue);

    }
}
