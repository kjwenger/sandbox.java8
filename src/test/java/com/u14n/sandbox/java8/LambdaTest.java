/**
 * 
 */
package com.u14n.sandbox.java8;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Klaus Wenger
 *
 */
public class LambdaTest {

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        // Empty
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        // Empty
    }

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        // Empty
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
        // Empty
    }

    @SuppressWarnings("boxing")
    @Test
    public void shouldStreamMapAndReduceAnArray() {
        assertEquals(42, (int) Arrays.asList(1, 2, 3, 4, 5, 6).stream()
                .map(e -> e * 2).reduce(0, (c, e) -> c + e));
    }

}
