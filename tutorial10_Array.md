# Working with 2D Array
For this tutorial you have two tasks. First one is to print a 2D array and the second task is transposing a 2D array. The detail 
instruction is given below. 
# Task 1
## Traversing an entire 2D Array

Use the starter code given under the package *array* for this part. You will be filling in methods that will go through all elements in
a 2D array and print the data to the console. The main has already been set up for you. You will need to fill in the following methods 
in the PrintArray Class. 

Each method includes a comment block above the method that explains what the code should do.

- public void printRow_LastToFirst(int[][] list)
- public void printCol_FirstToLast(int[][] list)
-	public void printCol_LastToFirst(int[][] list)
 
 
 
# Expected output for each method

With the array that is set up in the main you should get the following output for each method:

 **printRow_FirstToLast**  -  this method has been written for you as an example of where to start

[99][98][97][96][95]

[ 0][ 1][ 2][ 3][ 4]

[ 0][ 2][ 4][ 6][ 8]

[ 0][ 3][ 6][ 9][12]

[ 0][ 4][ 8][12][16] 


**printRow_LastToFirst**

-----------------------
[16][12][ 8][ 4][ 0]

[12][ 9][ 6][ 3][ 0]

[ 8][ 6][ 4][ 2][ 0]

[ 4][ 3][ 2][ 1][ 0]

[95][96][97][98][99]	

**printCol_FirstToLast**

----------------------
[99][ 0][ 0][ 0][ 0]

[98][ 1][ 2][ 3][ 4]

[97][ 2][ 4][ 6][ 8]

[96][ 3][ 6][ 9][12]

[95][ 4][ 8][12][16]	

**printCol_LastToFirst**

-------------------------
[16][12][ 8][ 4][95]

[12][ 9][ 6][ 3][96]

[ 8][ 6][ 4][ 2][97]

[ 4][ 3][ 2][ 1][98]

[ 0][ 0][ 0][ 0][99]

# Task 2
## Transposing a 2D Array
Write a program that asks the user to enter 9 integers and place them into a 3x3 2d array. Then transpose the array so the first
row becomes the first column, the second row becomes the second column, and the third row becomes the third column. Here is an example: 

Original Array: 

1 2 3 

4 5 6 

7 8 9 

Transposed Array: 

1 4 7 

2 5 8

3 6 9 

If you look carefully, you will notice that the numbers on diagonals are swapped. Also, the numbers that are swapped have inverted
locations in the matrix (2 is in position [0][1] and 4, the number it swaps with, is in position [1][0]). 
You can use this relationship within nested for loops to perform the transposition.

# Grading
- 1 point for submitting on time (by next Tuesday March 24th)
- 2 points for completing all tasks correctly.
