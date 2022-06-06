import java.util.Random;

public class BubbleSortExample {
    private int[] theArray;

    public BubbleSortExample(int size) {
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

    public void bubbleSort() {
        for(int i = theArray.length - 1; i > 1; i++) {

        }
    }
}
