import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        // Writing option menu for users

        System.out.println("1. List all files");
        System.out.println("2. Detailed options");
        System.out.println("3. Close application");

        System.out.println("Please select one of the following options:");
        // scanner is the name I gave to Scanner, then choose new scanner
        Scanner scanner = new Scanner(System.in);
        // reads the user input and stores it in the variable
        String userInput = scanner.nextLine();
        if (userInput.equals("1")) {
            System.out.println("user select option 1");
            File directoryFiles = new File(System.getProperty("user.dir"));
            File[] allFiles = directoryFiles.listFiles();
            List<File> sortedFile = Arrays.stream(allFiles)
                    .sorted().toList();

            for (File f : sortedFile) {
                System.out.println(f);
            }


        } else if (userInput.equals("2")) {
            System.out.println("user select option 2");
            /*options for user to select
            add file
            delete file
            search file
             */
            System.out.println("1.Add file");
            System.out.println("2.Delete file");
            System.out.println("3.Search file");

            System.out.println("Please select one of the following options");
            Scanner findobj = new Scanner(System.in);
            String userInput = scanner.nextLine();

            if (userInput.equals("1")) {
                System.out.println("user select option 1");
                try {
                    File myObj = new File("filename.txt");
                    if (myObj.createNewFile()) {
                        System.out.println("File created: " + myObj.getName());
                    } else {
                        System.out.println("File already exists.");
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
            }
        } else if (userInput.equals("2")) {
            System.out.println("user select option 2");
                File myObj = new File("filename.txt");
                if (myObj.delete()) {
                    System.out.println("Deleted the file: " + myObj.getName());
                } else {
                    System.out.println("Failed to delete the file.");
                }

            }
    else {
            System.out.println("user select option 3");
                String fileName = args[0]; // For the filename declaration
                String directory;
                boolean found;

                File dir = new File(directory);

                File[] matchingFiles = dir.listFiles(new FilenameFilter() {
                    public boolean accept(File dir, String fileName) {
                        return true;
                    }
                });


    } else{(userInput.equals("3"));{
            System.out.println("user select option 3");
            System.exit(0);
        } else {
            System.out.println("Invalid input");

        }
    }

