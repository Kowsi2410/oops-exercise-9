
package characterbytestreamexample;
import java.io.*;

public class Characterbytestreamexample{

    public static void main(String[] args) {
        String fileName = "binaryFile.bin";
        String content = "Hello, this is a binary file!";

        // Writing to a binary file using Byte Streams
        try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
            byte[] bytes = content.getBytes();
            outputStream.write(bytes);
            System.out.println("Data has been written to the binary file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the binary file.");
            e.printStackTrace();
        }

        // Reading from a binary file using Byte Streams
        try (FileInputStream inputStream = new FileInputStream(fileName)) {
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println("\nData has been read from the binary file.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the binary file.");
            e.printStackTrace();
        }

        // Writing to a binary file using Character Streams
        try (FileWriter fileWriter = new FileWriter(fileName);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(content);
            System.out.println("Data has been written to the binary file using Character Streams.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the binary file using Character Streams.");
            e.printStackTrace();
        }

        // Reading from a binary file using Character Streams
        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Data has been read from the binary file using Character Streams.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the binary file using Character Streams.");
            e.printStackTrace();
        }
    }
}


