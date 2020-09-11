package test.java.yaksha;

import main.java.yaksha.BikeRace;
import main.java.yaksha.TestUtils;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class BikeRaceMainTest {

	@Test
	void testFindBonusPoint() throws IOException {
		
		BikeRace b=new BikeRace();
		//assertEquals("Your bonus points is 72", b.findBonusPoint(8694));
		//assertEquals("Invalid Input", b.findBonusPoint(-1));
		TestUtils.yakshaAssert(TestUtils.currentTest(),b.findBonusPoint(8694).equals("Your bonus points is 72")==true?"true":"false",TestUtils.businessTestFile);
		TestUtils.yakshaAssert(TestUtils.currentTest(),b.findBonusPoint(-1).equals("Invalid Input")==true?"true":"false",TestUtils.businessTestFile);
		
	}
	@Test
	public void testExceptionConditon() throws Exception{

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.boundaryTestFile);	             

	}	 

	@Test
	public void testBoundaryCondition() throws Exception {

	              TestUtils.yakshaAssert(TestUtils.currentTest(),false,TestUtils.exceptionTestFile);
	}

}
