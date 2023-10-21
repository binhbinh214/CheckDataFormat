package view;

import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);

    public void displayPrompt(String fieldName) {
        System.out.print(fieldName + ": ");
    }

    public String getInput() {
        return scanner.nextLine();
    }

    public void displayErrorMessage(String message) {
        System.out.println(message);
    }

    public void displaySuccessMessage() {
        System.out.println("Input is correct!");
    }
}
