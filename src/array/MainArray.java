package array;
import java.util.*;
public class MainArray {
	
	    public static void main(String args[])
	    {
	        
	        PrintArray mainPrintArray = new PrintArray();
	        int[][] values = new int[5][5];
	        
	       
	        mainPrintArray.loadWithData(values);
	        mainPrintArray.printRow_FirstToLast(values);
	        
	        mainPrintArray.printRow_LastToFirst(values);
	        mainPrintArray.printCol_FirstToLast(values);
	        mainPrintArray.printCol_LastToFirst(values);
	    }
	}


