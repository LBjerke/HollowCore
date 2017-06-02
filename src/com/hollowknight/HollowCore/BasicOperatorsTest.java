package com.hollowknight.HollowCore;

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

}