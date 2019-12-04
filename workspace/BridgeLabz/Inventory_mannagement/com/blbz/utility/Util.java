/*****************************************************************************************
 *this file contains all utility function required by programs
 * @author 	Vishal kumar
 * @Version	1.0
 * @Date	28/11/19
 * @file	Util.java
 *****************************************************************************************/

package com.blbz.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Util
{
	public static Scanner sc=new Scanner(System.in);
	
	public static char readChar()
	{
		try {
			return sc.next().charAt(0);
		}
		catch(Exception e)
		{
			return 0;
		}
				
	}

	public static String readString()
	{
		String s=sc.next();
		return s;
	}
	public static String readline()
	{
		try {
			String s=sc.nextLine();
			return s;
		}
		catch(Exception e) 
		{
		System.out.println(e);
		return null;
		}
		
	}
	public static int readint()
	{
		try {
			return sc.nextInt();
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	public static double readDouble()
	{
		try {
		return sc.nextDouble();
		} 
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0;
	}
	public static boolean readboolean()
	{
		return sc.nextBoolean();
	}
	public static float readfloat()
	{
		return sc.nextFloat();
	}
	public static JSONObject readData() 
	{
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = new JSONObject();
		
		try {
			jsonObject = (JSONObject) jsonParser.parse(new FileReader("inventory.json"));
			
			//System.out.println("Data from utility :"+jsonObject);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return jsonObject;
	}
	
	public static  void writedata()
	{
		
	}

	public static boolean intChecker(String number) 
	{
		// regular expression for an integer number 
        String regex = "[+-]?[0-9][0-9]*"; 
        
     // compiling regex 
        Pattern p = Pattern.compile(regex); 
        
     // Creates a matcher that will match input1 against regex 
        Matcher m = p.matcher(number);
        
        if(m.find() && m.group().equals(number)) 
        	return true;
        
		return false;
	}
	 public static boolean isStringOnlyAlphabet(String str) 
	    { 
	        return ((str != null) 
	                && (!str.equals("")) 
	                && (str.matches("^[a-zA-Z]*$"))); 
	    }
	 
	 public static void scannerClose() {
			try {
				sc.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
	 }
	
}