package filewordcount;

import java.io.*;
//package filewordcount;
public class FileWordCount {

    public static void main(String[] args) {
        String fileName = "sampleFile.txt";
        String content = "This is a sample sentence to check the number of three letter word the file contains";

        try {
            File file = new File(fileName);

            // Creating the file
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Writing content to the file
            FileWriter writer = new FileWriter(file);
            writer.write(content);
            writer.close();

            // Counting three-letter words in the file
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            int count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.length() == 3) {
                        count++;
                    }
                }
            }
            reader.close();
            System.out.println("Number of three-letter words in the file: " + count);

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

