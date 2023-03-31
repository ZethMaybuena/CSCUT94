package com.stir.cscu9t4practical1;

public class SwimEntry extends Entry{
	private String where;
	
	public SwimEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String wer) {
		super(n, d, m, y, h, min, s, dist);
		//TODO Task 6
		where = wer;
	}

	public String getWhere() {
		return where;
	}
	
	public String getEntry() {
		
		String result = getName()+" swam " +getDistance() + " km "
	            + getHour() + ":" + getMin() + ":" + getSec() + " on "
	            + getDay() + "/" + getMonth() + "/" +getYear() + "\n";
		return result;
	}
}
