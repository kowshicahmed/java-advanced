import java.io.*;
import java.sql.SQLOutput;

public class SerDeserDemo {
    public static void main(String[] args) {
        Student student = new Student("John", 25, "23 East California");
        String filename = "/home/akash/Documents/Programming/Java/java-advanced/04_Serialization/01_SerializationBasics/Test.txt";
        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;

        // Serialization
        try {
            fileOut = new FileOutputStream(filename);
            objOut = new ObjectOutputStream(fileOut);
            objOut.close();
            fileOut.close();
            System.out.println("Object has been serialized: \n" + student);
        } catch (IOException e) {
            System.out.println("IOException is caught");
        }

        // Deserialization
        FileInputStream fileIn = null;
        ObjectInputStream objIn = null;
        try {
            fileIn = new FileInputStream(filename);
            objIn = new ObjectInputStream(fileIn);

            Student object = (Student) objIn.readObject();
            System.out.println("Object has been deserialized: \n" + object);
            objIn.close();
            fileIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}
