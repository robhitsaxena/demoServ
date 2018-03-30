package com.atlassian;

import junit.framework.TestCase;
import org.junit.*;

/**
 * Created by robhit_saxena on 3/31/2018 AD.
 */
public class testSourceTest extends TestCase {
    @Test
    public void testAdd() throws Exception {
        testSource junit = new testSource();
        int result = junit.add(100,200);
        assertEquals(300,result);
    }

    @Test
    public void testConCat() throws Exception {
        testSource junit = new testSource();
        String result = junit.ConCat("robhit","saxena");
        assertEquals("robhitsaxena",result);



    }

}