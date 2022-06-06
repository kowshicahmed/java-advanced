public class ArrayStructures {

    private int[] theArray = new int[50];
    private int arraySize = 10;

    public void generateRandomArray() {
        for(int i = 0; i < arraySize; i++) {
            theArray[i] = (int)(Math.random()*10)+10;
        }
    }

    public void printArray() {
        System.out.println("--------------");
        for(int i = 0; i < arraySize; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");
        }
        System.out.println("--------------");
    }

    public int getValueAtIndex(int index) {
        if(index < arraySize)
            return theArray[index];
        return 0;
    }

    public boolean doesArrayContainThisValue(int searchValue) {
        boolean valueInArray = false;
        for(int i = 0; i < arraySize; i++) {
            if (theArray[i] == searchValue) {
                valueInArray = true;
                break;
            }
        }
        return valueInArray;
    }

    public void deleteIndex(int index) {
        if(index < arraySize) {
            if (arraySize - 1 - index >= 0)
                System.arraycopy(theArray, index + 1, theArray, index, arraySize - 1 - index);
            arraySize--;
        }
    }

    public void insertValue(int value) {
        if(arraySize < 50) {
            theArray[arraySize] = value;
            arraySize++;
        }
    }

    public String linearSearchForValue(int value) {
        boolean valueInArray = false;
        String indexWithValue = "";
        System.out.println("The value was found the the following: ");

        for(int i = 0; i < arraySize; i++) {
            if(theArray[i] == value) {
                valueInArray = true;
                System.out.print(i + " ");
                indexWithValue += i + " ";
            }
        }
        if(!valueInArray) {
            indexWithValue = "None";
            System.out.println(indexWithValue);
        }
        System.out.println();
        return indexWithValue;
    }

    public void printHorzArray(int i, int j){

        for(int n = 0; n < 51; n++)System.out.print("-");

        System.out.println();

        for(int n = 0; n < arraySize; n++){

            System.out.print("| " + n + "  ");

        }

        System.out.println("|");

        for(int n = 0; n < 51; n++)System.out.print("-");

        System.out.println();

        for(int n = 0; n < arraySize; n++){

            System.out.print("| " + theArray[n] + " ");

        }

        System.out.println("|");

        for(int n = 0; n < 51; n++)System.out.print("-");

        System.out.println();

        // END OF FIRST PART


        // ADDED FOR BUBBLE SORT

        if(j != -1){

            // ADD THE +2 TO FIX SPACING

            for(int k = 0; k < ((j*5)+2); k++)System.out.print(" ");

            System.out.print(j);

        }


        // THEN ADD THIS CODE

        if(i != -1){

            // ADD THE -1 TO FIX SPACING

            for(int l = 0; l < (5*(i - j)-1); l++)System.out.print(" ");

            System.out.print(i);

        }

        System.out.println();

    }
}
