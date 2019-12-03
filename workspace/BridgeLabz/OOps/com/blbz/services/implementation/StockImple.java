/*********************************************************************************************
 * This file do all the implemntation/calculation part of program ,implements stock interface
 * @author 	vishal kumar
 * @purpose to perform implementation of stockInterface
 * @version 1.0
 * @date 	02/12/19
 **********************************************************************************************/


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
	@SuppressWarnings("unchecked")
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
	/*this methode finds out the total number of shares
	 * @param 	void
	 * @return	void
	 */
	@Override
	public void numberofshare() {
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
	
	/*this the implemetation of shareprice methode in stockinterface it shows the share price of total
	 * @param  -nothing
	 * @return -void 
	 */
	
	@Override
	public void sharePrice() {
		try {
			JSONParser jpar=new JSONParser();
			Object obj=jpar.parse(new FileReader(path));
			JSONArray jarr=(JSONArray)obj;
			System.out.println("Choose your company name");
			for(Object read:jarr)
			{
				JSONObject input=(JSONObject)read;
				System.out.println((String)input.get("Comapny_name"));
			}
			String company=Util.readline();
			for(Object read:jarr)
			{
				JSONObject input=(JSONObject)read;
				if((String)input.get("Company_name")==company)
				{
					System.out.println("The stock price of "+company+" is "+input.get("stock_value"));
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	/*this methode gives the whole report of total stock and prices
	 * @param -nothing
	 * @return -nothing
	 */
	
	
	@Override
	public void stockreport() {
		System.out.println("showing the all companies stocks and stock values");
		viewshare();
		System.out.println("--------------final Stock report is----------------");
		
		try 
		{	
			JSONParser jpar=new JSONParser();
			Object obj=jpar.parse(new FileReader(path));
			JSONArray jarr=(JSONArray)obj;
			int count=0;
			for(Object read:jarr)
				{
					JSONObject readstock=(JSONObject)read;
					double temp=(int)readstock.get("Stocks");
					totalshare=totalshare+temp;
					
					JSONObject readvalue=(JSONObject)read;
					double temp1=(int)readvalue.get("Stocks");
					totalprice=totalprice+temp1;
					count++;
				}
			System.out.println("Total number of Comapnies "+count);
			System.out.println("Total number of Stocks "+totalshare);
			System.out.println("Total price of stocks "+totalprice);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	

	public void removeshare() {
		
	try {
			
		System.out.println("enter the name of company which stocks to be remove");
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
		}	
	catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}
}
	
