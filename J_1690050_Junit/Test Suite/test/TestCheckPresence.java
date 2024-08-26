package com.wipro.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

class TestCheckPresence {

	@Test
	void testCheckPresence() {
		DailyTasks dt=new DailyTasks();
		assertTrue("Not contains",dt.checkPresence("Hello", "o"));
	}

}
