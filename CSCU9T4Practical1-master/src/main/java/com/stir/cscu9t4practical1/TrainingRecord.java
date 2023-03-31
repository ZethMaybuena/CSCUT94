// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;

import java.util.*;


public class TrainingRecord {
    private List<Entry> tr;
    
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    } //constructor
    
    // add a record to the list
   public void addEntry(Entry e){
       tr.add(e);    
   } // addClass
   
   //TODO Task 2
   
   
   public String lookupEntry (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result = "";
       while (iter.hasNext()) {
          Entry current = iter.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) {
             result += current.getName() + ", ";
          }
             }
       if (!result.isEmpty()) {
    	   result += " running on this day ";
    	   
       }
       if (result.isEmpty()) {
    	   result = "No entries found";
       }
       return result;
   }
   
   //TODO Task 3
   public String findallbydate (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result = "";
       while (iter.hasNext()) {
           Entry current = iter.next();
           if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) {
              result += current.getEntry();
           }
       }
       if (result.isEmpty()) {
    	   result = "No entries found";
       }
       return result;
   }
   
   public void clear(String name, int d, int m, int y) {
	   for (Entry entry : tr) {
		   if (entry.getName().equals(name) &&
		   entry.getDay() == d &&
		   entry.getMonth() == m &&
		   entry.getYear() == y) {
			   tr.clear();
			   return;
		   }
		   
	   }
   }
   
   
   
   
   
   // Count the number of entries
   public int getNumberOfEntries(){
       return tr.size();
   }
   // Clear all entries
   public void clearAllEntries(){
       tr.clear();
   }
   
} // TrainingRecord