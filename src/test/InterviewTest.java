package test;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import developer.Interview;


public class InterviewTest {
	
	List<String> nameList = new ArrayList<String>();
	@Before
	public void start(){
		
		nameList.add("MADHULIKA");
		nameList.add("MARY");
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testMixedCaseName() {
		
		List<String> nameListResult = new ArrayList<String>();
		nameListResult.add("Madhulika");
		nameListResult.add("Mary");
		
	   // Tests
		 assertEquals(Interview.mixedCaseName(nameList),nameListResult);		
	  } 
	@Test
	public void testCalculateBirthday(){
	
		List<Date> birthdayListResult = new ArrayList<Date>();
		SimpleDateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
	    String birthday = "04/"+"06/"+"1981";
	    String birthday1 = "04/"+"06/"+"1986";
		Date date1 = null;
		Date date2 = null;
		try {
			date1 = dateformat.parse(birthday);
			date2 = dateformat.parse(birthday1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		birthdayListResult.add(date1);
		birthdayListResult.add(date2);	 
	 assertEquals(Interview.calculateBirthday(nameList),birthdayListResult);
 	 
	}

}
