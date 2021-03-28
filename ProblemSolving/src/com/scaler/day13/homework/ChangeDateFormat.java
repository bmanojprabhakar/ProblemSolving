package com.scaler.day13.homework;

import java.util.HashMap;
import java.util.Map;

public class ChangeDateFormat {
	public String solve(String A) {
		String[] dateSplit = A.split(" ");
		
		String date = dateSplit[0];
		String month = dateSplit[1];
		String year = dateSplit[2];
		
		Map<String, String> monthInNumbers = new HashMap<>();
		monthInNumbers.put("Jan", "01");
		monthInNumbers.put("Feb", "02");
		monthInNumbers.put("Mar", "03");
		monthInNumbers.put("Apr", "04");
		monthInNumbers.put("May", "05");
		monthInNumbers.put("Jun", "06");
		monthInNumbers.put("Jul", "07");
		monthInNumbers.put("Aug", "08");
		monthInNumbers.put("Sep", "09");
		monthInNumbers.put("Oct", "10");
		monthInNumbers.put("Nov", "11");
		monthInNumbers.put("Dec", "12");
		
		date = date.substring(0, date.length()-2);
		month = monthInNumbers.get(month);
		
		if(date.length()==1)
			date = "0"+date;
		
		return year+"-"+month+"-"+date;
		
    }
	
	public static void main(String[] args) {
		ChangeDateFormat obj = new ChangeDateFormat();
		System.out.println(obj.solve("6th Jun 1933"));
	}

}
