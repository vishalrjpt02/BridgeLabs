package com.blbz.services.implementation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.blbz.Classmodel.StockModel;
import com.blbz.services.StockInterface;
import com.blbz.utility.Util;

public class StockImple implements StockInterface{
	
	static String path="/home/admin1/Dektop/vishal/sample2.json";
	static double totalshare;
	static double totalprice;
	
	
	
	/*methode add a company into the list
	 * @param none
	 * @return nothing
	 */
	public void addshare()
	{
		try {
			FileReader fr=new FileReader(path);
			JSONParser read=new JSONParser();
			Object obj=read.parse(fr);
			JSONArray list_array=(JSONArray)obj;
			FileWriter fw = new FileWriter(path);
			JSONObject jobj = new JSONObject();
			
			//Adding the company and stocks
			
			String name;
			int number_of_stock;
			int stock_value;
			System.out.println("Enter the name of company:");
			name = Util.readString();
			

			System.out.println("Enter the nuber of stock: ");
			number_of_stock = Util.readint();
			

			System.out.println("Enter the value of stock :");
			stock_value = Util.readint();
			
			//new stock has been created
			StockModel Stock;
			Stock =new StockModel(name, number_of_stock, stock_value);
			
			jobj.put("Company_name",Stock.getName());
			jobj.put("Stocks",Stock.getShares());
			jobj.put("stock_value", Stock.getPrice());
			
			list_array.add(jobj);
			fw.flush();
			fw.close();
		}	
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*to view the element from list
	 * @param:	nothing
	 * @return:	void
	 */
	public void viewshare()
	{
		try {
			
			JSONParser jp = new JSONParser();
			Object parse = (Object)jp.parse(new FileReader(path));
					
			JSONArray ja = (JSONArray)parse;
			//System.out.println(parse);

			for (Object i : ja) {
				JSONObject jobj = (JSONObject)i;
				System.out.println("Company name : " + jobj.get("Company_name"));
				System.out.println("number of Stocks : " + jobj.get("Stocks"));
				System.out.println("Stock price : " + jobj.get("stock_value"));
				System.out.println();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void nubmerofshare() {
		try {
		double total_share = 0;
		int count_of_share=0;
		JSONParser jpar=new JSONParser();
		Object obj=jpar.parse(new FileReader(path));
		JSONArray jarr=(JSONArray)obj;
		for(Object read:jarr)
		{
			JSONObject input=(JSONObject)read;
			double temp=(double)input.get("stocks");
			total_share=total_share+temp;
			count_of_share++;
		}
		System.out.println("Total number of shares are " +count_of_share +"\n amount of whole share is"+total_share);
		
		} 
		catch (IOException | ParseException e) {
					e.printStackTrace();
		}
	}
	@Override
	public void sharePrice() {
		try {
			JSONParser jpar=new JSONParser();
			Object obj=jpar.parse(new FileReader(path));
			JSONArray jarr=(JSONArray)obj;
			for(Object read:jarr)
			{
				JSONObject input=
			}
			
		}
		
	}
	@Override
	public void stockreport() {
		// TODO Auto-generated method stub
		
	}
}
