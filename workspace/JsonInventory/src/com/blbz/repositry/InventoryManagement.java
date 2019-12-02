/**********************************************************************************
 * This file contains all methods related to file operations
 * @author 	Vishal kumar
 * @version 1.0
 * @date 	30/11/19
 **********************************************************************************/

package com.blbz.repositry;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class InventoryManagement {
	
	static String path="/home/admin1/Desktop/vishal/sample1.json";
	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) {

		JSONObject obj = new JSONObject();
		obj.put("Name", "Rice");
		obj.put("weight", new Integer(50));
		obj.put("price", new Integer(70));

		JSONObject obj1 = new JSONObject();
		obj1.put("Name", "Wheat");
		obj1.put("weight", new Integer(50));
		obj1.put("price", new Integer(40));

		JSONObject obj2 = new JSONObject();
		obj2.put("Name", "pulses");
		obj2.put("weight", new Integer(50));
		obj2.put("price", new Integer(120));

		JSONArray inventory = new JSONArray();
		inventory.add(obj);
		inventory.add(obj1);
		inventory.add(obj2);
		// try-with-resources statement.
		try (FileWriter file = new FileWriter(path)) {
			file.write(inventory.toJSONString());
			// System.out.println(inventory);
		} catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		try {
			JSONParser parser = new JSONParser();
			Object parse = parser.parse(new FileReader(path));
			JSONArray JSON = (JSONArray) parse;

			for (Object j : JSON) 
			{
				JSONObject N = (JSONObject) j;
				System.out.println("Name :" + N.get("Name"));
				System.out.println("Price :" + N.get("price"));
				System.out.println("Weight :" + N.get("weight"));
			}

		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}