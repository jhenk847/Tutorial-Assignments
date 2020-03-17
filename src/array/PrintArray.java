package array;


/**
 * Holds the main PrintArray of the example program
 * @author 
 * @version 1.0
 */

import java.io.*;
import java.util.*;

public class PrintArray
{

    /**
     * Loads the 2D array with starting values for the Tutorial
     */
    public void loadWithData(int[][] list)
    {
        for(int row=0; row < list.length; row++)
            for(int col=0; col < list[row].length; col++)
                list[row][col] = row * col;

        if(list.length > 0) // must be at least one row
        {
            for(int col = 0; col < list.length; col++)
                list[0][col] = 99 - col;
        }
    }

    /**
     * Prints the contents of the provided 2D array to the console
     * Starting at the top left element and ending at the bottom right 
     * element, moving row by row. Moving from left to right for each row
     * 
     */
    public void printRow_FirstToLast(int[][] list)
    {
        for(int row=0; row < list.length; row++)
        {
            for(int col=0; col < list[row].length; col++)
            {
                System.out.print(String.format("[%2d]",list[row][col]));
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Prints the contents of the provided 2D array to the console
     * Starting at the bottom right element and ending at the top right 
     * element, moving from right to left for each row
     */
    public void printRow_LastToFirst(int[][] list)
    {
        
    }

    /**
     * Prints the contents of the provided 2D array to the console
     * Starting at the top left element and ending at the bottom right 
     * element, moving Col by Col. Moving from top to bottom for each col
     */
    public void printCol_FirstToLast(int[][] list)
    {
        
    }

    /**
     * Prints the contents of the provided 2D array to the console
     * Starting at the bottom right element and ending at the top left 
     * element, moving Col by Col. Moving from bottom to top for each col
     */
    public void printCol_LastToFirst(int[][] list)
    {
        
    }

}
