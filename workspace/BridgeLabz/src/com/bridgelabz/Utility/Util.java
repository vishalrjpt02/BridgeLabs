/**********************************************************************************
 * @author   vishal kumar
 * @version  1.0
 * @purpose  To create a utility package
 * @date     21/11/19
 * @file	 Util.java
 **********************************************************************************/


package com.bridgelabz.Utility;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Util 
{
	
	
	/* To scan any type of data
	 * @param type(for normal)=void
	 * @param type(for array)=A/c to type of data
	 * @return type (for normal)=void
	 * @return type(for array)=a/c to data type
	 */
	
	static Scanner sc=new Scanner(System.in);
	
	public static int readint()
	{
		return sc.nextInt();
	}
	
	public static int[] readintarray(int len)
	{
		int[] arr=new int[len];
		for(int i=0;i<len;i++)
		   arr[i]=sc.nextInt();
		return arr;
	}
	
	public static String readline()
	{
		return sc.nextLine();
	}

	public static String readnext()
	{
		return sc.next();
	}
	
	public static String[] readlinearray(int len)
	{
		String[] arr=new String[len];
		for(int i=0;i<len;i++)
			sc.nextLine();
		return arr;
	}

	public static char readchar()
	{
		return sc.next().charAt(0);
	}
	
	public static char[] readchar(int len)
	{
		char arr[]=new char[len];
		for(int i=0;i<len;i++)
			arr[i]=sc.next().charAt(0);
		return arr;
	}
	public static float readfloat()
	{
		return sc.nextFloat();
	}
	
	public static float[] readfloat(int len)
	{
		float []arr=new float[len];
		for(int i=0;i<len;i++)
			arr[i]=sc.nextFloat();
		return arr;
	}
	public static double readDouble()
	{
		return sc.nextFloat();
	}
	
	public static double[] readDouble(int len)
	{
		double arr[]=new double[len];
		for(int i=0;i<len;i++)
		{
			arr[i]=sc.nextDouble();
		}
		return arr;
	}
	
	public static byte readbyte()
	{
		return sc.nextByte();
	}
	
	
	/*
	 *	Method to replace a word from a string.
	 *	@param type- takes two input string full string and string to replace 
	 *	@return type-Edited String 
	 */
	
	
	
	public static String ReplaceString(String s1,String s2) 
	{
		String s3=myscanner.readLine();
		String out="";
		for(String s:s1.split("\\s"))
		{
			if(s.equals(s2))
			{
				s=s3;
				out=out+s+" ";
				
			}
			else
			out=out+s+" ";
		}
		return out;
	}
	
	
	
	
	/* 	Method to find out the flip coin percentage of head and tail
	 * 	@param  - input the number of flips 
	 * 	@return - an Array of elements having number of heads and tails
	 */	
	public static double[] flipcoin(int time) 
	{
		double head=0;double tail=0;
		double headcount=0,tailcount=0;
		double []arr=new double[2];
		
		if(time>0)
		{
			for(int i=0;i<=time;i++)
			{
				head=Math.random();
				tail=Math.random();
				if(head>0.5)
				{
					headcount++;
				}
				else if(tail>0.5)
				{
					tailcount++;
				}
				
			}
		}
		else
			System.out.println("enter the valid number");
		arr[0]=headcount;
		arr[1]=tailcount;
		arr[2]=(tailcount/headcount)*100;
		return arr;

	}
	
	
	

	/*	Method to check leap year
	 * 	@Param - integer
	 *  @return- boolean yes or no
	 */
	
	public static boolean leapYear(int year) 
	{
		
		
		boolean out=false;
		if(year>1000)
		{
			if(year/4==0)
			{
				if(year/100!=0 && year/400==0)
				{
					out=true;
				}
				else
					out= false;
			}
		}
		return out;
	}
	
	
	
	
	
	
	/* power of 2 in a given range
	 * @param type - integer 
	 * @return type- double an array of elements containing table
	 */
	public static double[] poweof2(int num) 
	{
		double out[]=new double[10];
		double out1=0;
		double sample=Math.pow(2,num);
		for(int i=0;i<sample;i++)
		{
			out1=Math.pow(2,i);
			if(out1<sample)
			{
				out[i]=out1;
			}
			
		}
		return out;
	}
	
	
	
	
	//harmonic number
	/*	To find out a Nth harmonic value
	 * 	@param type - integer nth element to find out the value
	 * 	@return type- double value of Nth element
	 */
	
	public static double harmonic(int limit) 
	{
		double sum=0;
		int num=limit;
		if(num>1)
		{
			for(double i=1;i<=num;i++)
			{
				sum=sum+1/i;
			}	
		}
		return sum;
	}
	
	
	
	
	/* to print 2D array
	 * @param type - void
	 * @return type - void
	 */
	
	public static void TwoDarray() 
	{
		int arr[][]=new int[3][3];
		for(int i=0;i<3;i++)
			{
			for(int j=0;j<3;j++)
				{
				  arr[i][j]=myscanner.readInteger();
				}
			}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	/*	sum of 3 digit add to zero
	 * 	@param type - array of Integer
	 * 	@return type - array of integer 
	 */
	public static int[] sumof3digit(int arr[]) 
	{

		int out[]=new int[3];

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				for(int k=j+1;k<arr.length;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{

						out[0]=arr[i];
						out[1]=arr[j];
						out[2]=arr[k];
						break;
					}
				}
			}
		}
		return out;
	}
	
	
	
	
	/*	Distance of ecludian point
	 *	@param type  - two integer value 
	 * 	@return type - double
	 */
	
	public static double ecludian(int x,int y)
	{
		double out=0;
		out=Math.sqrt(((x*x) + (y*y)));
		return out;
	}
	
	
	
	/*	To find out the quadratic value of a equation
	 *	@param type  - three integers 
	 * 	@return type - two double value root1 and root2
	 */
	public static double[] quadratic(int a,int b,int c)
	{
		
		double delta = ((b*b)-(4*a*c));
		double root[]=new double[1];
		if(delta>0)
		{
		root[0]=(-b + Math.sqrt(delta))/(2*a);
		root[1]=(-b - Math.sqrt(delta))/(2*a);
		return root;
		}
		else if(delta==0)
		{
			root[0]=root[1]= -b/2*a;
			
		}
		else
			root[0]=(Math.sqrt(-delta)/(2*a));
		return root;
	}
	
	
	
	
	
	/*	To find out the windchill
	 *	@param type- two integers 
	 * 	@return type- double
	 */
	public static double Windchill()
	{
		double t=myscanner.readDouble();
		double v=myscanner.readDouble();
		double windchil=0;
		if(t<50 && v<120)
		windchil= 35.74+(0.6215*t)+((0.4275*t)-35.75)*Math.pow(v,0.16);
		return windchil;
	}
	
	
	
	/*	To find out the win loss and %ge of win if number of plays in min and max money given
	 *	@param type- two integers 
	 * 	@return type- array of double containing total bet,win and loss. 
	 */
	
	public static double[] Gambbler(int max,int min,int plays)
	{
		double []arr=new double[2];
		int win=0,loss=0;
		int bet=0,cash=max;
		for(int i=0;i<plays;i++)
		{
			while(cash>min && cash>0)
			{
				bet++;
				if(Math.random()>0.5)
					{win++; cash++;}
				else
					{loss++; cash--;
					}
			}
			
		}
		arr[0]=bet;
		arr[1]=win;
		arr[2]=loss;
		return arr;
	}
	
	
	
	
	//Coupon Numbers
	/*	To find out the n number of time find numbers coupons 
	 *	@param type- integer
	 * 	@return type- double
	 */
	public static double CuponNumber(int num)
	{
		double arr[]=new double[num];
		int count=0;
		while(count<=num)
		{
			double rnum=Math.random();
			for(int i=0;i<arr.length;i++)
			{
				
				if(arr[i]==rnum)
				{
					break;
				}
				else
				{
					arr[i]=rnum;
					count++;
				}
				
			}
			
		}
		return count;
	}	
	
	
	
	
	/*	To simulate Stopwatch
	 *	@param type- void  
	 * 	@return type- elipsed time
	 */
	
	public static double Stopwatch() 
	{
		
		  System.out.print("to start type 1\n");
		  int s=myscanner.readInteger();
		  double start=0.0;
		  double stop=0.0;
		  double out=0.0;
		  if(s==1)
		  {
		  start=System.currentTimeMillis();
		  System.out.print("enter end to 0\n");
		  int end=myscanner.readInteger();
		  	if(end==0)
		  	{
		  		stop=System.currentTimeMillis();
		  		out=(stop-start);
		  	}
		  }
		  return out;
	}
	
	
////////////////////JUNIT Testing//////////////////////////JUNIT testing//////////////////
/*****************************************************************************************
 * @Author - Vishal kumar
 * @Version - 1.0
 * @purpose -to Implement junit testing programs
 * @date    -21-11-19
 * @File    -util.java
******************************************************************************************/
	
	
	
	 /* Vending Mechine to find out minimum numbers of note
	 *  @param - int
	 *  @return- int
	 */
	public static int vendingMech(int num)
	{
		int notes[]={1000,500,100,50,10,5,2,1};
		int notecount[]=new int[8];
		int count=0;
		for(int i=0;i<notes.length;i++)
		{
			if(num>=notes[i])
			{
				notecount[i]=num/notes[i];
				num=num-notecount[i]*notes[i];
			}
		}
		System.out.println("Currency Count ->"); 
	       for (int i = 0; i<8; i++)
	        { 
	           if (notecount[i] != 0)
	           { 
	               count++; 
	           }     
	        }
	       return count;
	}
	
	
	
	//Day of the week
	/*
	 * to find out the day of the week 
	 * @param- int ,int ,int
	 * @return -String
	 */
	
	
	public static String Dayoftheweek(int d,int m,int y)
	{
		int x=0;
		String out="";
		y=y-(14-m)/12;
		x = y+ y/4-y/100 + y/400;
		m=m+12*((14-m)/12)-2;
		d= (d+x+31*m/12)%7;
		String []days={"sunday","monday","tuesday","Wednesday","thursday","friday","friday","saturday"};
		for(int i=0;i<days.length;i++)
		{
			if(d==i)
			{
				out=days[i];
			}
		}
		return out;
		
	}
	
	
	
	
	// 
	/*to convert Temperature from farenhite to celicus
	 * @param  - int
	 * @return - double
	 */
	public static void Temprature(double temp) 
	{
		double cel = 0.0;
		cel = (temp - 32) * 5 / 9;
		System.out.print(cel);

	}
	
	
	/* to calculate Monthly payment
	 * @param -double int double
	 * @return- double
	 */
	
	public static double Payment(double p,int y,double r)
	{
		double pay=0.0;
		int n=12*y;
		double R=r/(12*100); 
		pay = p*R/(1-Math.pow(1+R,-n));
		return pay;
	}
	
	//sqare root
	/* to calculate square root of a number
	 * @param -integter
	 * @return- double
	 */
	public static double sqrt(int c)
	{
		double epsilon=1e-15;
		double t=c;
		while(Math.abs(t-c/t)>epsilon*t)
		{
			t=(c/t+t)/2.0;
		}
		return t;
	}
	
	
	/* Decimal to Binary conversion
	 * @param -integer
	 * @return-integer Arraylist
	 */
	public static ArrayList<Integer> toBinary(int n)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		while(n>0)
		{
			int rem=n%2;
			al.add(rem);
			n=n/2;
		}
		Collections.reverse(al); 
		//Iterator<Integer> itr= al.iterator();
		/*while(itr.hasNext())
		{
			System.out.print(itr.next());
		}*/
		return al;
	}
	
	
	
	/* decimal to binary and nubbies conversion and add to decimal
	 * @param -integer
	 * @return-double
	 */
	public static double Binarytodecimal(int n)
	{
		double out=0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		while(n>0)
		{
			int rem=n%2;
			al.add(rem);
			n=n/2;
		}
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		for(int i=0;i<al.size()/2;i++)
		{
			al1.add(al.get(i));
		}
		
		Collections.reverse(al); 
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		for(int i=0;i<al.size()/2;i++)
		{
			al2.add(al.get(i));
		}
		
		for(int i=0;i<al.size()/2;i++)
		{
			;//System.out.print(al1.get(i));
		}
		
		System.out.print("  ");
		
		for(int i=0;i<al.size()/2;i++)
		{
			;//System.out.print(+al2.get(i));
		}
		
		al.removeAll(al);
		al.addAll(al2);
		al.addAll(al1);
		
		for(int i=0;i<al.size();i++)
		{
			double sum=2;
			
			if(al.get(i)>0)
			{
				int count =i;
				while(count>=0)
				{
					sum=Math.pow(2,i);
					sum=sum*2;
					count--;
				}
				out=out+sum;
			}	
		}
		
		return out;
		
	}
	
	

/******************************Algorithm programs****************************************

  @author Vishal kumar
  @purpose To implement Algorithm programs
  @date 21-11-19
***************************************************************************************/
	
	/* To find out permutation of a string
	 * @param -String,Integer,Integer
	 * @return-String Arraylist
	 */
	static ArrayList<String> al=new ArrayList<String>();
	public static ArrayList<String> permute(String str,int l,int r)
	{
		if(l==r)
		{
			al.add(str);
		}
		else
		{
			for(int i=l;i<r;i++)
			{
				str=swap(str,l,i);
				permute(str,l+1,r);
				str=swap(str,l,i);
			}
		}
		return al;
	}
	public static String swap(String a,int i,int j)
	{
		char temp;
		char[]arr=a.toCharArray();
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
		return String.valueOf(arr);
	}
	
	
	
	
	
	/* To search a word from a list using BinarySearch
	 * @param - string array,string,integer,integer
	 * @return- int(index of the word)
	 */
	public static int binarySearch(String ar[],String k,int low,int high)
	{
		int index=0;
		if(high>=low)
		{
		int mid=low+(high-low)/2;
		
		if(k==ar[mid])
		{
			index=mid;
		}
		else if(ar[mid].compareTo(k)>0)
		{
			low=mid+1;
			binarySearch(ar,k,low,high);
		}
		else if(k.compareTo(ar[mid])<0)
		{
			high=mid-1;
			binarySearch(ar,k,low,high);        
		}
		}
		return index;
	}
	
	
	/*
	 * To perform Insertion sort
	 * @param -integer array
	 * @return-Integer array
	 */
	public static int[] InsertionSort(int arr[])
	{
		
		for(int i=0;i<arr.length;i++)
		{
			int temp=arr[i];
			int j=i;
			while(j>0 && temp<arr[j-1] )
			{
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
		return arr;
	}
	
	/*To perform bubble sorting on array
	 * @param  integer Array
	 * @return integer Array
	 */
	public static int[] BubbleSort(int arr[])
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		/*for(int i=0;i<arr.length;i++)
		System.out.print(arr[i] +"  ");*/
		return arr;
	}
	
	
	/*method to perform merg sorting
	 * @param int array
	 * @return int array
	 */
	public static int[] mergeSort(int[] ar) {

		if (ar.length <= 1) {
			return ar;
		}
		
		int midpoint = ar.length / 2;
		int[] left = new int[midpoint];
		int[] right;

		if (ar.length % 2 == 0) {
			right = new int[midpoint];
		} else {
			right = new int[midpoint + 1];
		}

		for (int i = 0; i < midpoint; i++) {
			left[i] = ar[i];
		}

		for (int j = 0; j < right.length; j++) {
			right[j] = ar[midpoint + j];
		}

		int[] result = new int[ar.length];

		left = mergeSort(left);
		right = mergeSort(right);
		result = merge(left, right);

		// below return will be changed
		return result;

	}
	
	
	/*Method to return the merged element for merg sorting
	 * @param int array int array
	 * @return int array
	 */

	public static int[] merge(int[] left, int[] right) 
	{

		int[] result = new int[left.length + right.length];
		int leftPointer, rightPointer, resultPointer;
		leftPointer = rightPointer = resultPointer = 0;

		while (leftPointer < left.length || rightPointer < right.length) {
			if (leftPointer < left.length && rightPointer < right.length) {
				if (left[leftPointer] < right[rightPointer]) {
					result[resultPointer++] = left[leftPointer++];
				} else {
					result[resultPointer++] = right[rightPointer++];
				}
			} 
			else if (leftPointer < left.length) {
				result[resultPointer++] = left[leftPointer++];
			} else if (rightPointer < right.length) {
				result[resultPointer++] = right[rightPointer++];
			}
		}

		return result;
	}
	
	
	/* Anagram Detection program
	 * @param  string,string
	 * @return boolean
	 */
	public static boolean checkanagrm(String in,String comp)
	{
		char []ar1=in.toCharArray();
		char []ar2=comp.toCharArray();
		String estring="";
		boolean chk=false;
		for(int i=ar2.length-1;i>=0;i--)
		{
			estring=estring+ar2[i];
		}
		ar2=estring.toCharArray();
		for(int i=0;i<ar1.length;i++)
		{
			if(ar1[i]==ar2[i])
			{
				chk=true;
			}
			else
				chk=false;
		}
		return chk;
	}
	
	/*To check primne numbers in a given range and to anagram
	 * @param  -integer range
	 * @return -arraylist of items
	 */
	public static ArrayList<Integer> CalculatePrime(int start,int end)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=start;i<end;i++)
		{
			boolean chk=false;
			for(int j=i-1;j>1;j--)
			{
				if(i%j==0)
				{
					chk=true;
				}
				
			}
			if(chk==false && Anagram(i) )
				{
					al.add(i);
					
				}
		}
		return al;
	}
	
	public static boolean Anagram(int n)
	{
		int rev=0;
		int num=n;
		while(n>0)
		{
			int temp=n%10;
			rev=rev*10+temp;
			n=n/10;
		}
		if(num==rev)
		{
			return true;
		}
		else
			return false;
	}
	
	/*Question to find your number
	 * @param -integer number and a number to run the loop(n=0)
	 * @return-integer number
	 */
	public static int search(int num,int n)
	{
		int out=0;
		if(num>n)
		{
			if(num==Math.pow(2,n))
			{
				out=num;
			}
				search(num,n+1);
		}
		return out;
	}
	
	
/**************************************************************************************
 *                             *DataStructre programs
 * 
**************************************************************************************/
	
	
}
