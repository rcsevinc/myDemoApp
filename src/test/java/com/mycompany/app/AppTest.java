package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    public void testFound() {
      ArrayList<String> array = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
      assertTrue(new App().contains(array, "a","b"));
    }

    public void testNotFound() {
      ArrayList<String> array = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
      assertFalse(new App().contains(array, "a", "e"));
    }

    public void testEmptyArray() {
      ArrayList<String> array = new ArrayList<>();
      assertFalse(new App().contains(array, "a","b"));
    }

    public void testNull() {
        ArrayList<String> array = null;
      assertFalse(new App().contains(array, "a", "b"));
    }
    
    public void testSameString() {
      ArrayList<String> array = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
      assertFalse(new App().contains(array, "a", "a"));
    }
    

}
