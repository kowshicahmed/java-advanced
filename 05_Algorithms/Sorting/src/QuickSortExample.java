import java.util.Random;

public class QuickSortExample {

    private int[] theArray;

    public QuickSortExample(int size) {
        this.theArray = new int[size];

        Random rand = new Random();
        for(int i = 0; i < theArray.length; i++) {
            theArray[i] = rand.nextInt(100);
        }
    }

    public void printArray() {
        System.out.println("--------------");
        for(int i = 0; i < theArray.length; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");
        }
        System.out.println("--------------");
    }

    public int[] getTheArray() {
        return theArray;
    }

    public static void quicksort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    public static void quicksort(int[] array, int lowIndex, int highIndex) {
        // checking if the array has only one element
        if(lowIndex >= highIndex) {
            return;
        }
        // get a random index number between high and low index
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = array[pivotIndex]; // randomly choose pivot
        swap(array, pivotIndex, highIndex); // swap pivot element with the last element right away

        int leftPointer = partition(array, lowIndex, highIndex, pivot); // partition

        // recursion
        quicksort(array, lowIndex, leftPointer - 1);    // sort left side of the pivot
        quicksort(array, leftPointer + 1, highIndex);      // sort right of the pivot
    }

    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        // partitioning
        while(leftPointer < rightPointer) {
            while(array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while(array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer); // swap when both while loops exit
        }
        swap(array, leftPointer, highIndex);    // swap the pivot with the pointer when both pointers meet
        return leftPointer;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
