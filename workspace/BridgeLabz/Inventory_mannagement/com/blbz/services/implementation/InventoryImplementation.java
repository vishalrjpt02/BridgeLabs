 /***********************************************************************************************
 * this file is the implemenatation of interface it process the input and gives the result
 * @author	vishal kumar
 * @version 1.0
 * @date	30/11/19
 * @purpose	to implement the abstract method of invertry Interface.
 ***********************************************************************************************/

package com.blbz.services.implementation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.blbz.Classmodel.InventoryModel;
import com.blbz.services.InventoryInterface;
import com.blbz.utility.Util;

public class InventoryImplementation implements InventoryInterface {

	static String path ="/home/admin1/Desktop/vishal/sample1.json";
	static int price = 0;
	static int total = 0;

	/*to add the element from list
	 * @param:	nothing
	 * @return:	void
	 */
	@SuppressWarnings({ "unchecked" })
	@Override
	public void add() {
		try {
//File reader to read the files from inventory and parse them 
//to store in new array .
			FileReader fr = new FileReader(path);

			JSONParser jParse = new JSONParser(); //jsonparser is used to read json data
			Object obj = jParse.parse(fr);
			JSONArray list_array = (JSONArray) obj;
			FileWriter fw = new FileWriter(path);
			JSONObject jobj = new JSONObject();

//New inventory created
			InventoryModel inventory ;

//adding data(name/price/weight) to inventory
			String name;
			int price;
			int weight;
			System.out.println("Enter the name of item :");
			name = Util.readline();
			

			System.out.println("Enter the price of item :");
			price = Util.readint();
			

			System.out.println("Enter the Weight of the item :");
			weight = Util.readint();
			
			inventory =new InventoryModel(name, price, weight);
			
			//JSONArray list_array=new JSONArray();
			
			//JSONObject name_obj =new JSONObject();
			jobj.put("price", inventory.getPrice());
			jobj.put("Name", inventory.getName());
			
			jobj.put("weight", inventory.getWeight());
			
			System.out.println(jobj);
			//adding the new data to array			
			list_array.add(jobj);
			
		
//Rewriting the new Array data to json file	
			fw.write(list_array.toJSONString());
			fw.flush();
			fw.close();
			System.out.println("Added..!!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*to view the element from list
	 * @param:	nothing
	 * @return:	void
	 */
	@Override
	public void view() {
		try {
			JSONParser jp = new JSONParser();
			Object parse = (Object)jp.parse(new FileReader(path));
					
			JSONArray ja = (JSONArray)parse;
			//System.out.println(parse);

			for (Object i : ja) {
				JSONObject jobj = (JSONObject) i;
				System.out.println("Name : " + jobj.get("Name"));
				System.out.println("Price : " + jobj.get("price"));
				System.out.println("weight : " + jobj.get("weight"));
				System.out.println();
			}

		} 
		
	 catch (FileNotFoundException e) 
	  {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	  }
	/*to remove the element from list
	 * @param:	nothing
	 * @return:	void
	 */

	public void remove() 
	{
		try {
			System.out.println("Enter the item name to be removed : ");
			String item = Util.readString();
			boolean result = true;
			FileReader fr = new FileReader(path);
			JSONParser jp = new JSONParser();
			JSONArray jarray = (JSONArray) jp.parse(fr);
			for (int i = 0; i < jarray.size(); i++) {
				JSONObject jobj = (JSONObject) jarray.get(i);

				if (item.equals(jobj.get("Name"))) {
					jarray.remove(jobj);
					result = false;
					break;
				}
			}
			if (result) {
				System.out.println("Not found..");
			} else {
				System.out.println("Successful.");
			}
			try (FileWriter fw = new FileWriter(path)) {
				fw.write(jarray.toJSONString());
				fw.flush();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	/*	method to read the file
	 * @param:	nothing
	 * @return:	jsonArray 
	 */
	public static JSONArray readFile() {
		try {
			FileReader fw = new FileReader(path);
			JSONParser jpar = new JSONParser();
			Object obj = jpar.parse(fw);
			JSONArray jarr = (JSONArray) obj;

			return jarr;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void parseInventory(JSONObject obj) {
		JSONObject jobj = (JSONObject) obj.get("Inventory");
		String name = (String) jobj.get("Name");
		System.out.println("Name " + name);
		System.out.println("Name  : " + name);
		String Weight = String.valueOf(jobj.get("Weight"));
		System.out.println("Weight: " + Weight);
		String Price = String.valueOf(jobj.get("PricePerKg"));
		System.out.println("Price : " + Price);

	}
	/*to get the weight of listed items
	 * @param:	nothing
	 * @return:	void 
	 */

	@Override
	public void totalWeight() {
		long total = 0;
		try {
			JSONParser jpar = new JSONParser();
			Object obj = jpar.parse(new FileReader(path));
					
			JSONArray jarr = (JSONArray) obj;
			for (Object i : jarr) {
				JSONObject jobj = (JSONObject) i;
				long a = (long) jobj.get("weight");
				total = total + a;
			}
			System.out.println(total);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void exit() {

	}

	/*to get the price of list
	 * @param:	nothing
	 * @return:	void 
	 */
	@Override
	public void totalPrice() {
		long total = 0;
		long overall = 0;
		try {
			JSONParser jpar = new JSONParser();
			Object obj = jpar.parse(new FileReader(path));
					
			JSONArray jarr = (JSONArray) obj;
			// System.out.println(jarr);

			for (Object i : jarr) {
				JSONObject jobj = (JSONObject) i;
				long a = (long) jobj.get("weight");
				long b = (long) jobj.get("price");
				total = a * b;
				overall = overall + total;
			}
			System.out.println(overall);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}