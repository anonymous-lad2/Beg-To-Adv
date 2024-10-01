package Basic_Part1;

import javax.print.attribute.IntegerSyntax;
import java.nio.channels.FileChannel;
import java.util.*;

public class FirstClass {

    public static void main(String[] args) {

        int result = 10;

//        compound operator
        result -= 5.5;     // result = (data type of result)(result - 5.5)
        System.out.println(result);

//        result = result - 5.5;
//        This gives the error due to conversion from int to double

        int sample1 = Integer.MAX_VALUE + 1;  //Overflow
        System.out.println(sample1);

        sample1 = 2147483647 + 10;
        System.out.println(sample1);

        sample1 = Integer.MAX_VALUE * 2;
        System.out.println(sample1);

//        sample1 = 2147483648;
//        This gives the error


        int sample2 = Integer.MIN_VALUE - 1;  //Underflow
        System.out.println(sample2);

//        sample2 = -2147483649;

//        byte a = Byte.MAX_VALUE + 1;

//        It gives error in case of byte but not in case of int because :-
//            when you perform arithmetic operations on byte,
//            short, or char values, the result is always an int.
//            So, when you write Byte.MAX_VALUE + 1, the result of the addition is an int value,
//            which is 128. However, when you try to assign this int value to a byte variable,
//            the compiler checks whether the value is within the range of a byte (-128 to 127).
//            Since 128 is outside this range, the compiler throws an error.

//        System.out.println(a);

        long a = Integer.MAX_VALUE + 1;
//        Integer.MAX_VALUE + 1 is first evaluated as an int operation because both operands are int types.
        System.out.println(a);

        a = Integer.MAX_VALUE + 1L;
        System.out.println(a);


        byte myMinByteValue = Byte.MIN_VALUE;
//        byte myNewByteValue = myMinByteValue / 2;

        byte myNewByteValue = -200 / 2;
        System.out.println(myNewByteValue);

//        float f = 5.25;   double is the default floating point number so 5.25 here is double.
        float f = 5.25f;
        System.out.println(f);
    }
}
