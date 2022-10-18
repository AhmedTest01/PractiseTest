/**
 * 
 */
package practise.com.practise.sadek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author sadekahmed
 *
 */
public class ArrayListAssignement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*1. Write a Java program to create a new array list,o
		                 *  add some colors (string) and print out the collection*/
		
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Grey");
		colors.add("White");
		colors.add("Black");
		
		System.out.println(colors.size());
		
		for(String e : colors) {
			System.out.println(e);
		}
		
		System.out.println("------------------------");
		
		/* 2. Write a Java program to insert
		 *  an element into the array list at the first and last positions.*/
		
		colors.add(0,"Purple");
		colors.add("Pink");

		for(String e : colors) {
			System.out.println(e);
		}
		
		/*Collections.sort(colors);
		for(String e : colors) {
			System.out.println(e);
		}*/
		/*3. Write a Java program to retrieve an element

		                 * (at a specified index) from a given array list.
		                 */
		
		System.out.println(colors.get(4));
		/* 4. Write a Java program to update specific array element by given element.
		                 * 
		                 */
		
		colors.set(0, "Golden");
		
		for(String e : colors) {
			System.out.println(e);
		}
		
		/* 5. Write a Java program to remove the third  element from a array list. 
		                 * 
		                 */

		
		colors.remove(2);
		
		/* 6. Write a Java program to search an element in a array list.
		        * 
		        */
		
		if(colors.contains("Red")) {;
		System.out.println("Element is present in ArrayList");
		}
		else {
			System.out.println("Element is not present in the ArrayList");
		}
		
		/* 7. Write a Java program to reverse elements in a array list
		                         *         
		                         */
		
		Collections.reverse(colors);
		
		System.out.println("----------------------");
		
		
		for(String e : colors) {
			System.out.println(e);
		}
		
		// Using a for loop
		
		for(int i = colors.size()-1; i>=0; i--) {
			System.out.println(colors.get(i));
			
		}
		
		/* 8. Write a Java program to extract a portion of a array list.
		                 *         
		                 */
		
		System.out.println("----------------------");
		
		List<String> newColorsList = colors.subList(0, 2);
		
		for(String e : newColorsList) {
			System.out.println(e);
		}
		System.out.println("----------------------");
	colors.add(1, colors.get(0));
	colors.set(0,colors.get(2));
	colors.remove(2);
	for(String e : colors) {
		System.out.println(e);
	}
	
	Collections.swap(colors, 03, 4);
	System.out.println("----------------------");
	
	for(String e : colors) {
		System.out.println(e);
	}
	
	/*11. Write a Java program to trim the virtual capacity of an
	                 *  array list the current list size.*/
	ArrayList<Integer> trimSize = new ArrayList<Integer>();
	trimSize.size();
	trimSize.trimToSize();
	
	
	/*12. Write a Java program to print all the elements of a
	                 *  ArrayList using the position of the elements*/
	for(int i = 0; i < colors.size(); i++) {
		System.out.println(colors.get(i));
		
	}
	}
	
	
}
