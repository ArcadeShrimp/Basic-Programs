/**
 * Name: Julio Dominguez
 * Login: cs11fapd
 * Date: December 26, 2016
 * File: Insertion Sort.java
 *
 */

import java.util.Random;

/**
 * The purpose of this file is to give me experience with insertion sort.
 */
public class Insertion_Sort{

  private static final int MAX_VALUE = 100;
  private static final int MAX_LENGTH = 100;
  private static int arrayLength = (int) (new Random().nextInt( MAX_LENGTH ) );
  private static int [] array = new int [arrayLength];
  private static int count = 0;
 
  // MAIN
  public static void main( String [] args ){
  
    //This populates our array with psuedo-random integers
    for( int i = 0; i < array.length; i++){
      array[i] = (int) (new Random().nextInt(MAX_VALUE));
    }

    insertionSort(array);   // call to insertionSort()

    // Print newly sorted array
    for( int element: array){
      System.out.println(element);
    }
    
    //Analysis information about the sort
    System.out.println("\n Number of Elements: " + array.length
                       + " \n Comparisons: " + count);
  }
  
  /*
   * Insertion sort works by taking the first element in the array and
   * considering it sorted. Then the next element is compared with every
   * element before it to determine its appropriate location.
   */
  private static int [] insertionSort( int [] array){
    int initial = array[0];  // First element is considered sorted
 
    // Iterates through every element in the array
    for( int i = 1; i < array.length; i++ ){
      
      // The selected element from the first loop is compared with all the
      // Elements before it which are sorted relative to themselves
      for( int j = i - 1; j >= 0; j--){

        if( array[i] < array[j] ){

          int temp = array[i];
          array[i] = array[j];
	  array[j] = temp;

	  i--;
	  count++;
        }

      }

    }

    return array;

  } //END insertionSort()

} // END Insertion_Sort Class
