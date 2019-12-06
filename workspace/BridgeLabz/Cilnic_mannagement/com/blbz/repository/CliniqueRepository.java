/***********************************************************************************************************
 *THisw the file to create a repositry for clinic mannagement package
 *@author  :vishal kumar
 *@version :1.0
 *@date    :05/12/19
 *@File    :ClinicRepositry.java
 ***********************************************************************************************************/

package com.blbz.repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CliniqueRepository {
	
	static String path = "JsonFile/doctor.json";
	
	public static void writeData(String filePath,JSONArray jsonArray) {
		try(FileWriter fileWriter = new FileWriter(filePath)){
			fileWriter.write(jsonArray.toJSONString());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static JSONArray readData(String filePath) {
		JSONArray jsonArray;
		try(FileReader fileReader = new FileReader(filePath)){
			JSONParser jsonParser = new JSONParser();
			jsonArray = (JSONArray) jsonParser.parse(fileReader);
			return jsonArray;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}