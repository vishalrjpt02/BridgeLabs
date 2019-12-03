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

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Util
{
	static Scanner sc=new Scanner(System.in);
	
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
	
	
	
	/*
	 * method to read a string
	 */
	public static String readString()
	{
		try{
			return sc.next();
		}
		catch(Exception e)
		{
			System.out.println("e");
		}
		return "";
	}
	public static String readline()
	{
		try{
			return sc.nextLine();
		}
		catch(Exception e)
		{
			System.out.println("e");
		}
		return "";
	}
	public static int readint()
	{
		try{
			return sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("e");
		}
		return 0;
	}
	public static double readDouble()
	{
		try{
			return sc.nextDouble();
		}
		catch(Exception e)
		{
			System.out.println("e");
		}
		return 0.0;
	}
	public static boolean readboolean()
	{
		try{
			return sc.nextBoolean();
		}
		catch(Exception e)
		{
			System.out.println("e");
		}
		return false;
	}
	public static float readfloat()
	{
		try{
			return sc.nextFloat();
		}
		catch(Exception e)
		{
			System.out.println("e");
		}
		return 0;
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
		
}