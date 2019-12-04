package com.blbz.Controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.blbz.Classmodel.CompanyShare;
import com.blbz.utility.Util;

public class ComapnyShareController {
	
public static CompanyShare companyDetails() {
		
		System.out.println("Enter Company Name");
		String cName = Util.readString();
		if(Util.isStringOnlyAlphabet(cName)) {
			
		}
		
		System.out.println("Enter Company Symbol");
		String symbol = Util.readString();
		
		System.out.println("Enter Number of Share");
		int numberOfShare = Util.readint();
		
		
		System.out.println("Enter Price");
		double price = Util.readDouble();
		
		
		// will give us the current time and date 
	    LocalDateTime current = LocalDateTime.now(); 
	   // System.out.println("current date and time : "+ current); 
		// to print in a particular format 
	    DateTimeFormatter format =  DateTimeFormatter.ofPattern("dd-MM-yyyy");   
	    
	    String dateTime = current.format(format);   
	     
	    //System.out.println("in foramatted manner "+ dateTime); 
	    
	    CompanyShare companyShare = new CompanyShare(cName,symbol,numberOfShare,price,dateTime);
		return companyShare;
	}

}
