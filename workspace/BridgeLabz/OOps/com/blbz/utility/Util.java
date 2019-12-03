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
			return null;
		}
		
	}
	public static String readline()
	{
		return sc.nextLine();
	}
	public static int readint()
	{
		return sc.nextInt();
	}
	public static double readDouble()
	{
		return sc.nextDouble();
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
		
}