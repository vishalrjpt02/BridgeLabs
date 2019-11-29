package com.brlbz.services.implementation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.blbz.services.InventoryInterface;
import com.blbz.utility.Util;

public class Inventerydetailimpl implements InventoryInterface
{

	public void defaultInventory()
	{
		JSONObject finalObject=new JSONObject();
		JSONArray jsonArray=new JSONArray();
		JSONArray jsonArray1=new JSONArray();
		JSONArray jsonArray2=new JSONArray();
		JSONArray jsonArray3=new JSONArray();
		
		JSONObject jsonobject=new JSONObject();
		jsonobject.put("Name","Wheat");
		jsonobject.put("Weight", 50.0);
		jsonobject.put("Price","1000");
		
		JSONObject jsonobject1=new JSONObject();
		jsonobject1.put("Name","Rice");
		jsonobject1.put("Weight", 100);
		jsonobject1.put("price", 1100);
		
		JSONObject jsonobject2=new JSONObject();
		jsonobject1.put("Name","Pulses");
		jsonobject1.put("Weight", 111);
		jsonobject1.put("price", 1200);
		
		JSONObject jsonobject3=new JSONObject();
		jsonobject1.put("Name","suger");
		jsonobject1.put("Weight", 100);
		jsonobject1.put("price", 1100);
		
		jsonArray.add(jsonobject);
		jsonArray.add(jsonobject1);
		jsonArray.add(jsonobject2);
		jsonArray.add(jsonobject3);
		
		try 
		{
			BufferedWriter writer=new BufferedWriter(new FileWriter("home/admin1/Desktop/vishal/sample.json"));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
		@Override
		public void listInventory(JSONArray jsonarray)
		{
			String array=jsonarray.toString();
			System.out.println(array);
		}
		
		
		
		public void writeData()
		{
			//Inventory array
			String[] names = new String[] {"Rice", "Wheat","Pulses","Suger"};
			JSONObject finalObject = new JSONObject();	
			for(String name: names) 
			{
				System.out.print("Enter number of types of " + name + " : ");
				int count = Util.readint();	//	types of every inventory
				JSONArray array = new JSONArray();	//	array to store types
				
				for(int i = 0; i < count; i++) {	//	 object for every type
					JSONObject jsonObject  = new JSONObject();
					System.out.print("Enter name, weight and price: ");
					jsonObject.put("name", Util.readString());
					jsonObject.put("weight", Util.readDouble());
					jsonObject.put("price", Util.readDouble());
					array.add(jsonObject);
				}			
				finalObject.put(name , array);
			}
		
			 //	to write data to the file
			try(PrintWriter printWriter = new PrintWriter("home/admin1/Desktop/vishal/sample.json")) 
			{
				printWriter.write(finalObject.toJSONString());
			
			} catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			}
		}
		
		public void readData()
		{
			JSONArray jsoninputdata=new JSONArray();
			JSONParser parsfiledata=new JSONParser();
			JSONObject object; //toread every type of data
			
			
			try(BufferedReader bufferedReader = new BufferedReader(new FileReader("home/admin1/Desktop/Sample.json"))) 
			{
				
				object = (JSONObject) parsfiledata.parse(bufferedReader);
				jsoninputdata = (JSONArray) object.get("Rice");
				System.out.println("Rice inventory value: " + getValue(jsoninputdata));
				jsoninputdata = (JSONArray) object.get("Pulses");
				System.out.println("Pulses inventory value: " + getValue(jsoninputdata));
				jsoninputdata = (JSONArray) object.get("Wheat");
				System.out.println("Wheat inventory value: " + getValue(jsoninputdata));

			}
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			catch(org.json.simple.parser.ParseException e)
			{
				e.printStackTrace();
			}	
		
		
		}
		/**
		 * @param array - json array
		 * @returns value of given inventory array
		 */
	
		double getValue(JSONArray array)
		{
			Iterator<?> iterator = array.iterator();	//	iterator to iterate
			double value = 0;							//	inventory value
			while(iterator.hasNext()) 
			{
				JSONObject obj = (JSONObject)iterator.next();
				double weight = (double)obj.get("Weight");
				double price = (double)obj.get("Price");
				value = value + weight * price;			//	adding value
			}
			return value;
		}
		
}