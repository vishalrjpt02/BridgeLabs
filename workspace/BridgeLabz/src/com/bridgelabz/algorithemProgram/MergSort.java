/**********************************************************************************
 * @author   Vishal kumar
 * @version  1.1
 * @purpose  To perform merg sort
 * @date     21/11/19
 * @file	 MergSort.java
 **********************************************************************************/
package com.bridgelabz.algorithemProgram;
import com.bridgelabz.Utility.Util;
public class MergSort 
{
	public static void main(String[] args) {

		int[] array = { 10, 20, 9 , 7, 8, 3, 2, 1, 1 };
		// 10, 20, 9 , 7, 8, 3, 2, 1, 1
		System.out.println("original");
		printArray(array);

		array = Util.mergeSort(array);
		System.out.println("after sorting");
		printArray(array);

	}
	
	/*method to print the array
	 * @param int array
	 * @return void
	 */
	private static void printArray(int[] ar) 
	{
		for (int i : ar) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}