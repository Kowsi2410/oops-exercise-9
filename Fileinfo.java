
package fileinfo;
import java.io.File;
import java.util.Scanner;
public class Fileinfo{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the file name: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        if (file.exists()) {
            System.out.println("File is available.");
            if (file.canRead() && file.canWrite()) {
                System.out.println("File is both readable and writable.");
            } else if (file.canRead()) {
                System.out.println("File is readable.");
            } else if (file.canWrite()) {
                System.out.println("File is writable.");
            }

            if (file.isFile()) {
                System.out.println("File is a regular file.");
            } else if (file.isDirectory()) {
                System.out.println("File is a directory.");
            }

            System.out.println("Length of the file in bytes: " + file.length());
        } else {
            System.out.println("File does not exist.");
        }

        scanner.close();
    }
}
