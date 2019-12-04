/************************************************************************************************
 * This file contains all abtract methods,this the interface for project
 * @author 	vishal kumar
 * @version 1.0
 * @date	02/12/19
 * @purpose	to provide the interface for program
 *************************************************************************************************/

package com.blbz.services;

import java.io.File;

public interface StockInterface {

	void addshare();
	void viewshare();
	void numberofshare();
	void sharePrice();
	void stockreport();
	void removeshare();
	void buyShare(double amount, String symbol, File file2);
	void sellShare(double amount, String symbol, File file2);
	void printTransactionDetails();
	
}
