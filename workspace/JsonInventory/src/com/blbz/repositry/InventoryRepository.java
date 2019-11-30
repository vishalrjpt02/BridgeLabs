/**********************************************************************************
 * This file contains all methodes realted to file oprations
 * @author 	vishal kumar
 * @version 1.0
 * @date 	30/11/19
 **********************************************************************************/

package com.blbz.repositry;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class InventoryRepository 
{
	public String path="/home/admin1/Desktop/vishal/sample.json";
	public JSONParser jsonparser=new JSONParser();
	public JSONObject jsonobject=new JSONObject();
	
	

	/*
	 * By using this method we write our user input data into the file as a json format
	 * @param-data - JSONObject
	 * @return - nothing 
	 * */
	public static void writeData(JSONObject jsonFinalObject) {
		File f = new File("inventory.json");
		
		try (FileWriter fileWriter = new FileWriter(f)) {

			fileWriter.write(jsonFinalObject.toJSONString());
			System.out.println("Data is added to the file!!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * reads data from json file and prints inventory value of Rice, Pulses and Wheat
	 * @param 	nothing
	 * @return	JSONObject
	 */
	public static JSONObject readData() {
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = new JSONObject();
		
		try {
			jsonObject = (JSONObject) jsonParser.parse(new FileReader("inventory.json"));
			
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