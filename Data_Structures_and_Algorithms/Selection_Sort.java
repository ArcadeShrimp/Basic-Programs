/**
 * Name: Julio Dominguez
 * Login: cs11fapd
 * Date: December 26, 2016
 * File: Selection_Sort.java
 */

/**
 * The purpose of this program is to give me experience with selection sort
 */

import java.util.Random;

public class Selection_Sort{
 
  private static final int MAX_VALUE = 100;
  private static final int ARRAY_LENGTH = 100;
  private static int [] array = new int[ARRAY_LENGTH];
  private static int count;

  public static void main (String [] args){

    // Populate the array
    for( int i = 0; i < array.length; i++){
      array[i] = (int)(new Random().nextInt(MAX_VALUE));
    }
    // Call Selection sort
    selectionSort(array);

    // Print results
    for(int element: array){
      System.out.println(element);
    }
    
    // Analysis information of algorithm
    System.out.println("\n Number of elements: " + array.length
                       + "\n Comparisons: " + count);
  }

  /*
   * Selection sort works by going through the array and finding the minimum 
   * value and swaping that element with the next unsorted element in the array
   */
  private static int [] selectionSort( int [] array ){

    for( int i = 0; i < array.length; i++){

      int indexMin = i;
      int minValue = array[i];

      for( int j = i + 1; j < array.length; j++){
 
        if(array[j] < array[indexMin]){
          indexMin = j;
          minValue = array[j];
	}

      count++;
     
      }

      int temp = array[indexMin];
      array[indexMin] = array[i];
      array[i] = temp;

    }

    return array;

  } //END selectionSort()

} //END Selection_Sort.java
