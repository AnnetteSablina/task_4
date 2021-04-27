package by.epamtc.task4.utility.input;

import by.epamtc.task4.utility.exception.FileException;
import by.epamtc.task4.utility.exception.NullException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringInput {

    public static String inputStringFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String inputStringFromFile(String filename) throws NullException, FileException {
        if (filename == null) throw new NullException("Filename is null!");

        File file = new File(filename);

        try (Scanner scanner = new Scanner(file)) {
            return scanner.nextLine();
        } catch (FileNotFoundException e) {
            throw new FileException("File not found");
        }

    }
}
