package com.wipro.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.wipro.task.DailyTasks;

class TestSortValues {

	@Test
	void testSortValues() {
		DailyTasks dt=new DailyTasks();
		int[] arr= {1,4,2,0};
		int[] res= dt.sortValues(arr);
		int[] exp= {0,1,2,4};
		assertArrayEquals("Sorting Error",exp,res);
	}

}
