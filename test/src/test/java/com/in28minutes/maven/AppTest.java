package com.in28minutes.maven;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest 
{
	@Test
	public void testApp()
    {
        assertEquals(2,new App().calculateSomething());
    }
}
