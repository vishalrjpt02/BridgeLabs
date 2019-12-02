package com.blbz.utility;


import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class TotalWeight 
{
	public static void main(String[] args) {
	String  path="/home/admin1/Desktop/vishal/sample1.json";
	long total=0;
		try {
			JSONParser jpar = new JSONParser();
			Object obj = jpar.parse(new FileReader(path));
			JSONArray jarr = (JSONArray) obj;
			for(Object i:jarr)
			{
				JSONObject jobj=(JSONObject) i;
			    long a=(long)jobj.get("weight");
				total=total+a;
			}
		System.out.println(total);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
