package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

class TestStringConcat {

	@Test
	void testDoStringConcat() {
		DailyTasks dt=new DailyTasks();
		String output=dt.doStringConcat("Hello", "World");
		assertEquals("String Concatenation error","Hello World",output);
//		fail("Not yet implemented");
	}

}
