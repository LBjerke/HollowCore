package com.hollowknight.HollowCore;

/**
 * Created by loyde on 6/1/17.
 */

public class BasicOperators {

    //adds b to a
    public double basicAdd(double a , double b) {
    double c;
    c = a + b;
    return c;
    }
    //subtracks b from a
    public double basicSubtract( double a , double b)
    {
        double c;
        c = a - b;
        return c;
    }
    //multiplies a by b
     public double basicMultiply(double a , double b)
     {
         double c;
         c = a * b;
         return c;
     }
     //divides a by b
     public double basicDivide(double a , double b)
     {
         double c;
         c = (b==0)? 0 : a/b;
         return c;
     }

}
