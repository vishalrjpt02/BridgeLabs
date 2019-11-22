package com.bridgelabz.Utility;
import java.util.Scanner;
public class myscanner {
	
	static Scanner sc=new Scanner(System.in);
	
	public static int readInteger()
	{
		return sc.nextInt();
	}
	public static String readLine()
	{
		return sc.nextLine();
	}
	public static String readString()
	{
		return sc.next();
	}
	public static char readchar()
	{
		return (sc.next().charAt(0));
	}
	public static float readfloat()
	{
		return sc.nextFloat();
	}
	public static boolean readBoolean()
	{
		return sc.nextBoolean();
	}
	public static double readDouble()
	{
		return sc.nextDouble();
	}
	public static byte readByte()
	{
		return sc.nextByte();
	}
	
}
