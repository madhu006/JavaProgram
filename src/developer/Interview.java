package developer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Interview {

	public static void main(String[] args) {
		
		HashMap<String,Date> personData = new HashMap<String,Date>();
		
		/**
		 * Load a list of string with the following names in all caps
		 * MARY, JOE, SIENNA, PETER
		 */
		List<String> nameList = new ArrayList<String>();
		nameList.add("MARY");
		nameList.add("JOE");
		nameList.add("SIENNA");
		nameList.add("PETER");
		List<String> mixedNameList = mixedCaseName(nameList);
		List<Date> birthdayList =calculateBirthday(nameList);
		/*
		Added the name (as a String) and corresponding birthday date (as a java.util.Date)
		 into a HashMap with the mixed-case name as the key, and the birthday date as the value.
		*/
		for(int i=0;i<mixedNameList.size();i++){
			personData.put(mixedNameList.get(i), birthdayList.get(i));
		}
			
		display(personData);
	}

	/***
	 * Using the HashMap of names and birthdays previously loaded, iterate through the map and display the
	 *  person’s name, year they were born, and their age (calculated age).
	 * @param personData
	 * 
	 * public method because implemented junit
	 */
	public static void display(HashMap<String, Date> personData) {
		

		 Set<Map.Entry<String, Date>> personDataEntrySet = personData.entrySet();

		    for (Map.Entry<String, Date> me : personDataEntrySet) {
		    	 Calendar cal = Calendar.getInstance();
		    	    cal.setTime(me.getValue());
		    	Age age = calculateAge(me.getValue());
				System.out.println(me.getKey() + " was born in "+ cal.get(Calendar.YEAR) + " and is "+ age.getYears() +" years old");
		    
		    }
		
	}

	/*
	 * Age is calculated using today's date
	 */
	 public static Age calculateAge(Date birthDate)
	   {
	      int years = 0;
	      int months = 0;
	      int days = 0;
	      // Using Calender
	      Calendar birthDay = Calendar.getInstance();
	      birthDay.setTimeInMillis(birthDate.getTime());
	      //Create current day
	      long currentTime = System.currentTimeMillis();
	      Calendar now = Calendar.getInstance();
	      now.setTimeInMillis(currentTime);
	      // Year difference
	      years = now.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);
	      int currentMonth = now.get(Calendar.MONTH) + 1;
	      int birthdayMonth = birthDay.get(Calendar.MONTH) + 1;
	      //Month difference
	      months = currentMonth - birthdayMonth;
	      //if month is less than zero decrease year
	      if (months < 0)
	      {
	         years--;
	         months = 12 - birthdayMonth + currentMonth;
	         if (now.get(Calendar.DATE) < birthDay.get(Calendar.DATE))
	            months--;
	      } else if (months == 0 && now.get(Calendar.DATE) < birthDay.get(Calendar.DATE))
	      {
	         years--;
	         months = 11;
	      }
	      //Compute age
	      if (now.get(Calendar.DATE) > birthDay.get(Calendar.DATE))
	         days = now.get(Calendar.DATE) - birthDay.get(Calendar.DATE);
	      else if (now.get(Calendar.DATE) < birthDay.get(Calendar.DATE))
	      {
	         int today = now.get(Calendar.DAY_OF_MONTH);
	         now.add(Calendar.MONTH, -1);
	         days = now.getActualMaximum(Calendar.DAY_OF_MONTH) - birthDay.get(Calendar.DAY_OF_MONTH) + today;
	      } else
	      {
	         days = 0;
	         if (months == 12)
	         {
	            years++;
	            months = 0;
	         }
	      }
	      
	      return new Age(days, months, years);
	   }
	/**
	 *Calculate each person’s birthday as April 6th, with the year of the birthday equal to 1990 minus 
	 *the length of the name). For example, Peter’s birthday would be April 6th, 1985.
	 *
	 */
	@SuppressWarnings("deprecation")
	public static List<Date>  calculateBirthday(List<String> nameList) {
		// TODO Auto-generated method stub
		List<Date> dateList = new ArrayList<Date>();
		for(int i=0;i<nameList.size();i++){
			int length = nameList.get(i).length();
			int birthdayYear = 1990 -length;
			SimpleDateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
		    String birthday = "04/"+"06/"+" "+birthdayYear;
			try {
			Date date = dateformat.parse(birthday);
				dateList.add(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}

			
		}
		return dateList;
		
	}

	/**
	 * Convert each name in the list to mixed case, where the first letter is capitalized, and 
	 * the rest is all lower case (e.g., PETER  Peter)
	 */
	public static List<String> mixedCaseName(List<String> nameList) {
		// TODO Auto-generated method stub
		List<String> nameList1 = new ArrayList<String>();
		for(int i=0;i<nameList.size();i++){
			String tmp = nameList.get(i).toLowerCase();		
			char[] tmp1 = tmp.toCharArray();
			Character tmpChar = Character.toUpperCase(tmp.charAt(0));
			tmp1[0] = tmpChar;
			nameList1.add(String.valueOf(tmp1));	
	
			
		}
		return nameList1;
	}

}
class Age
{
   private int days;
   private int months;
   private int years;
 
   private Age()
   {
      //Prevent default constructor
   }
 
   public Age(int days, int months, int years)
   {
      this.days = days;
      this.months = months;
      this.years = years;
   }
 
   public int getDays()
   {
      return this.days;
   }
 
   public int getMonths()
   {
      return this.months;
   }
 
   public int getYears()
   {
      return this.years;
   }
 
   @Override
   public String toString()
   {
      return years + " Years, " + months + " Months, " + days + " Days";
   }
}
