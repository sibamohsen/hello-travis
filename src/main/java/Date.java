
public class Date {

	static int dayOfTheWeek(int day, int month, int year){
		int result = (day + 2 *month + (3 * month + 3)/5 + year + year/4 - ((year/100) - (year/400)- 2)) % 7;	
				return result;
	}
	
	
	
	public static boolean istSchalt(int y) {
		if ((y%4 == 0)&& (y%100 != 0) && (y%400 == 0) )
			return true;
		else return false;
	}
	
	
	 static int daysPerYear(int year) {
		 if (istSchalt(year) == true) return 366;
		 else return 365;
	 }
	 
	 static  int daysPerMonth(int month, int year) {
		 
		 if (month == 1|| month == 3|| month ==5 ||  month == 7 || month ==8 || month == 10 || month == 12) return 31;
		 else if (month == 4|| month == 6|| month ==9 ||  month == 11) return 30;
		 else if (month == 2 && (istSchalt(year))) return 29;
		 else return 28;
		 
	 }
	 
	 static int dayOfTheYear(int day, int month, int year) {
		 int result= 0;
		while (month > 1) {
			result += daysPerMonth(month -1 , year);
			return result;
		}
		return result = day;
		
	 }
	 
	 
	 static int daysTillXmas(int day, int month, int year) {
		 int res = 0;
		 if(month == 12 && day == 24) return res = 0;
		 else if(month == 12 && day>24 && day<= 31) return res = (31 - day) + daysPerYear(year);
		 else if(month == 12 && day < 24) return res = 24-day;
		 else if(month < 12 && day < 24) return res = (24 - dayOfTheYear(day,month,year));
		 return res;
	 }
	
}
