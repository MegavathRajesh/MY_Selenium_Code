package practicepackage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Timeanddate {
	 
	    public static void main(String[] args) {
	        
	        LocalDate currentDate = LocalDate.now();

 	        LocalDateTime currentDateTime = LocalDateTime.now();

 	        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

 	        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

 	        System.out.println("Current Date: " + currentDate.format(dateFormatter));

 	        System.out.println("Day of the Week: " + currentDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));

 	        System.out.println("Current Year: " + currentDate.getYear());

 	        System.out.println("Current Time: " + currentDateTime.format(timeFormatter));
	    }
	}


