public class Main {
    public static void main(String[] args) {
        ArrayStructures arrayStructures = new ArrayStructures();

        arrayStructures.generateRandomArray();
        arrayStructures.printArray();

        System.out.println(arrayStructures.getValueAtIndex(5));
        System.out.println(arrayStructures.doesArrayContainThisValue(18));
        System.out.println(arrayStructures.doesArrayContainThisValue(11));

        arrayStructures.deleteIndex(4);
        arrayStructures.printArray();

        arrayStructures.insertValue(55);
        arrayStructures.printArray();

        arrayStructures.linearSearchForValue(17);
    }
}
