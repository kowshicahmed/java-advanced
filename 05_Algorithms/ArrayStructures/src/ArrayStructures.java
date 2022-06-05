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
        String indexsWithValue = "";
        System.out.println("The value was found the the following: ");

        for(int i = 0; i < arraySize; i++) {
            if(theArray[i] == value) {
                valueInArray = true;
                System.out.print(i + " ");
                indexsWithValue += i + " ";
            }
        }
        if(!valueInArray) {
            indexsWithValue = "None";
            System.out.println(indexsWithValue);
        }
        System.out.println();
        return indexsWithValue;
    }
}
