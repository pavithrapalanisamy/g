package Guvi;


	import java.util.Date;
	import java.util.Scanner;
	import java.text.SimpleDateFormat;
	public class TwoTimes {
		public static void main(String[] args) throws Exception{
			String time1 = "12:23:30";
			String time2 = "12:26:00";
	 
			SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
			Date date1 = format.parse(time1);
			Date date2 = format.parse(time2);
			long difference = date2.getTime() - date1.getTime();
			System.out.println(difference/1000);
		}
	}

