package com.hollowknight.HollowCore;

import org.bouncycastle.jcajce.provider.asymmetric.ec.KeyFactorySpi;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by loyde on 6/1/17.
 */
public class BasicOperatorsTest {
    @Test
    public void basicAdd() throws Exception {
        BasicOperators op = new BasicOperators();
        Assert.assertEquals(10 , op.basicAdd(4,6), 0.1);
    }
    @Test
    public void basicSubtract() throws Exception{
        BasicOperators op = new BasicOperators();
        Assert.assertEquals(10 , op.basicSubtract(30,20), 0.1);
    }
    @Test
    public void basicMultiply() throws Exception{
        BasicOperators op = new BasicOperators();
        Assert.assertEquals(10, op.basicMultiply(10,1),0.1);
    }
    @Test
    public void basicDivide() throws Exception{
        BasicOperators op = new BasicOperators();
        Assert.assertEquals(5 , op.basicDivide(25,5),0.1);
    }
    @Test
    public void basicDivideByZero() throws Exception{
        BasicOperators op = new BasicOperators();
        Assert.assertEquals(0 , op.basicDivide(10, 0), 0.0001);
    }

}