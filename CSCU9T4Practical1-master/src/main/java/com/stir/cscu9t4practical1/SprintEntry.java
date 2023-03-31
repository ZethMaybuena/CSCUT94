package com.stir.cscu9t4practical1;

public class SprintEntry extends Entry{
	private int recovery;
	private int repetition;
	
	public SprintEntry(String n, int d, int m, int y, int h, int min, int s, float dist, int _recovery, int _repetition) {
		super(n, d, m, y, h, min, s, dist);
		//TODO Task 6
		recovery = _recovery;
		repetition = _repetition;
	}

	public int getRecovery() {
		return recovery;
	}
	
	public int getRepetition() {
		return repetition;
	}
	
	public String getEntry() {
		String result = getName()+" sprinted " + getRepetition() + "x"+getDistance() + "m in"
	            + getHour() + ":" + getMin() + ":" + getSec() + " with " 
	            + getRecovery()+ " minutes recovery on "
	            + getDay() + "/" + getMonth() + "/" +getYear() + "\n";
		
		return result;
	}
}
