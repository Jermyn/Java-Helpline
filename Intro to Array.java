/* This java file is to intro you to Arrays.
Do not use arrows as shown here in your java program.
This is only for illustrative purposes.*/

/** Declaring an array
Syntax to create an array:
Datatype[] arrayName;**/
//Option 1
double[] myList;

/**Option 2
Syntax:
Datatype[] arrayName = new DataType[arraySize];**/
int[] myArray = new int[5]; --> //This creates an array called 'myArray' with size 5.

/**Option 3
Syntax:
Datatype[] arrayName = {element1, element2...};**/
int[] elementArr = {1, 2, 3, 5, 8, 9}; --> //This creates an array called 'elementArr' with elements '1, 2, 3, 5, 8, 9'

/** Using Option 3 as example.**/
elementArr[0] --> 1
elementArr[1] --> 2
elementArr[2] --> 3
elementArr[3] --> 5
elementArr[4] --> 8
elementArr[5] --> 9
/** The numbers in the square brackets, e.g. [0] refers to index position of the array
And the index position always start with zero and ends with the total elements - 1.
Because element '1' is in the first position, it is stored in index position zero of elementArr.
In order to get the element out from the array, you use elementArr[index position].
**/

// For example,//
System.out.println("First element is: " + elementArr[0]);

//This will print out:
First element is 1.

//If we want to print out all the values in the array
System.out.println("The elements are: ");
for (int index=0; index<elementArr.length; index++) {
	System.out.println(elementArr[index]);
}

/** Use array to do some calculations.**/
// Example of finding average of the elements in the array.
int total = 0;
double average;

for (int index=0; index<elementArr.length; index++) {
	total += elementArr[index];
}
average = total / elementArr.length;
System.out.println("The average of the elements is: " + average)

/**The result should produce:
The average of the element is: 4.6667