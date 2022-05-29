public enum WeekDay {
	
    SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3),
    THURSDAY(4), FRIDAY(5), SATURDAY(6);
    
	private int index;
	
    private WeekDay(int inputindex) {
    	this.index = inputindex;
    }
    
    public int getDayIndex(WeekDay wkday) {
    	int wkind = -1;
    	switch(wkday) {
	    	case SUNDAY:
	    		wkind = 0;
	    		break;
	    	case MONDAY:
	    		wkind = 1;
	    		break;
	    	case TUESDAY:
	    		wkind = 2;
	    		break;
	    	case WEDNESDAY:
	    		wkind = 3;
	    		break;
	    	case THURSDAY:
	    		wkind = 4;
	    		break;
	    	case FRIDAY:
	    		wkind = 5;
	    		break;
	    	case SATURDAY:
	    		wkind = 6;
	    		break;
    		default:
	    		wkind = 0;
    			break;
    	}
    	return wkind;
    }
    
    public WeekDay getToday() {
    	return WeekDay.values()[this.index];
    }
    
    public WeekDay getNextDay() {
    	// get all elements in the enum class
    	WeekDay [] all = WeekDay.values();
    	// get the size of the enum class
    	int size = all.length;
    	// get the position index of the enum class
    	int ordinal = this.ordinal();
    	// increment of the position index
    	int nextord = (ordinal + 1) % size;
    	// return the next elements according to the position
    	return all[nextord];
    }
    
}