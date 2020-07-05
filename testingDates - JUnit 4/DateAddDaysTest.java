package testingDates;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DateAddDaysTest {

	private Date today;
	private static int [] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	@Before
	public void setUp() throws Exception {
		today = new Date("December",31,2019);
	}
	
	@Test
	public void testMonthWithinBoundary() {
		Date todayTemp = today;
		Date tmrw = new Date();
	
		todayTemp.setMonth(1);
		todayTemp.setDay(3);
		
		tmrw.setMonth(todayTemp.getMonth());
		tmrw.setDay(todayTemp.getDay()+1);
		assertEquals(todayTemp.getMonth(), tmrw.getMonth()); //(1 = 1)
		assertTrue(todayTemp.getDay() < tmrw.getDay()); //
	}
	
	@Test
	public void testJanToFeb() {
		Date tmrw = new Date();
		today.setMonth(1);
		
		//Check days (doesn't account for year boundary)
		if(today.getDay() + 1 > daysInMonth[today.getMonth()-1]) {
			tmrw.setDay(1);
			tmrw.setMonth(today.getMonth()+1);
		} else {
			tmrw.setDay(today.getDay()+1);
			tmrw.setMonth(today.getMonth());
		}
		
		assertTrue(today.getDay() > tmrw.getDay()); //(31 > 1)
		assertTrue(today.getMonth() < tmrw.getMonth()); //(1 < 2)
	}
	
	@Test
	public void testJuneToJuly() {
		Date tmrw = new Date();
		today.setMonth(6);
		
		//Check days (doesn't account for year boundary)
		if(today.getDay() + 1 > daysInMonth[today.getMonth()-1]) {
			tmrw.setDay(1);
			tmrw.setMonth(today.getMonth()+1);
		} else {
			tmrw.setDay(today.getDay()+1);
			tmrw.setMonth(today.getMonth());
		}
		
		assertTrue(today.getDay() > tmrw.getDay()); //(31 > 1)
		assertTrue(today.getMonth() < tmrw.getMonth()); //(6 < 7)
	}
	
	@Test
	public void testYearDecemberToJanurary() {
		Date tmrw = new Date();
		
		//Check days
		if(today.getDay() + 1 > daysInMonth[today.getMonth()-1]) {
			tmrw.setDay(1);
		} else {
			tmrw.setDay(today.getDay()+1);
		}
		
		//Check months to account for December to January crossover (year)
		if(today.getMonth()+1 > 12) {
			tmrw.setMonth(1);
			tmrw.setYear(today.getYear()+1);
		} else {
			tmrw.setMonth(today.getMonth());
			tmrw.setYear(today.getYear());
		}
		
		assertTrue(today.getMonth() > tmrw.getMonth()); //(12 > 1)
		assertTrue(today.getYear() < tmrw.getYear());//(2019 < 2020)
	}
}