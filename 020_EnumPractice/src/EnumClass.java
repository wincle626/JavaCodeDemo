public class EnumClass {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WeekDay wkday = WeekDay.SUNDAY;
		System.out.println(wkday.getToday());
		System.out.println(wkday.getDayIndex(wkday));
		System.out.println(wkday = wkday.getNextDay());
		System.out.println(wkday.getDayIndex(wkday));
		
	}

}