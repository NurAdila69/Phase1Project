import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        // Writing option menu for users

        System.out.println("1. List all files");
        System.out.println("2. Detailed options");
        System.out.println("3. Close application");

        System.out.println( "Please select one of the following options:");
        // scanner is the name I gave to Scanner, then choose new scanner
        Scanner scanner = new Scanner(System.in);
        // reads the user input and stores it in the variable
        String userInput= scanner.nextLine();
     
    }
}
