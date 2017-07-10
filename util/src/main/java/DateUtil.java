package com.inventateq.Batch1.util;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class DateUtil 
{

 public static String getToday(){
	Date curDate = new Date();
	System.out.println(curDate.toString());
	String DateToStr = DateFormat.getInstance().format(curDate);

	return DateToStr;
 }
}

