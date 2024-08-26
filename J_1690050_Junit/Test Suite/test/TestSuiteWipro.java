package com.wipro.test;
import org.junit.runners.Suite;
import org.junit.runner.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestSortValues.class,
	TestStringConcat.class,
	TestCheckPresence.class
})

public class TestSuiteWipro {

}
